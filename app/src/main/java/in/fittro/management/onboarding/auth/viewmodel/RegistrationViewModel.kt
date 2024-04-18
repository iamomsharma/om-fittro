package `in`.fittro.management.onboarding.auth.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import `in`.fittro.management.onboarding.auth.repository.LoginRepository
import `in`.fittro.management.onboarding.auth.repository.RegistrationRepository
import `in`.fittro.management.onboarding.auth.response.LoginResponse
import `in`.fittro.management.onboarding.auth.response.RegistrationResponse
import `in`.fittro.retrofit.NetworkState
import `in`.fittro.retrofit.ResultWrapper
import kotlinx.coroutines.launch

class RegistrationViewModel: ViewModel() {

    private val registrationRepository = RegistrationRepository()

    private val _registrationMutableLiveData = MutableLiveData<NetworkState<RegistrationResponse>>()

    val registrationLivedata: LiveData<NetworkState<RegistrationResponse>> get() = _registrationMutableLiveData

    fun registration(name: String,
                     email: String,
                     password: String,
                     gender: String,
                     mobileNumber: String) {

        viewModelScope.launch {
            _registrationMutableLiveData.value = NetworkState.Loading()
            when (val result = registrationRepository.registration(name = name, email=email, password = password, gender=gender, mobileNumber=mobileNumber)) {
                is ResultWrapper.Success -> {
                    _registrationMutableLiveData.value = NetworkState.Success(result.value)
                }

                is ResultWrapper.NetworkError -> {
                    _registrationMutableLiveData.value = NetworkState.Error(Throwable(""),data = null)
                }

                is ResultWrapper.GenericError -> {
                    _registrationMutableLiveData.value = NetworkState.Error(Throwable(result.error.toString()), null)
                }
            }
        }
    }
}