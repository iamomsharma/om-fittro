package `in`.fittro.management.onboarding.auth.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import `in`.fittro.management.onboarding.auth.repository.LoginRepository
import `in`.fittro.management.onboarding.auth.response.LoginResponse
import `in`.fittro.retrofit.NetworkState
import `in`.fittro.retrofit.ResultWrapper
import kotlinx.coroutines.launch

class LoginViewModel: ViewModel() {

    private val repository = LoginRepository()

    private val _loginMutableLiveData = MutableLiveData<NetworkState<LoginResponse>>()

    val loginLivedata: LiveData<NetworkState<LoginResponse>> get() = _loginMutableLiveData

    fun login(email: String, password: String) {

        viewModelScope.launch {
            _loginMutableLiveData.value = NetworkState.Loading()
            when (val result = repository.login(email=email, password = password)) {
                is ResultWrapper.Success -> {
                    _loginMutableLiveData.value = NetworkState.Success(result.value)
                }

                is ResultWrapper.NetworkError -> {
                    _loginMutableLiveData.value = NetworkState.Error(Throwable(""),data = null)
                }

                is ResultWrapper.GenericError -> {
                    _loginMutableLiveData.value = NetworkState.Error(Throwable(result.error.toString()), null)
                }
            }
        }
    }
}