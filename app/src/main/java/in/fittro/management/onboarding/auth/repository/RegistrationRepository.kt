package `in`.fittro.management.onboarding.auth.repository

import `in`.fittro.management.onboarding.auth.response.LoginResponse
import `in`.fittro.management.onboarding.auth.response.RegistrationResponse
import `in`.fittro.retrofit.ResultWrapper
import `in`.fittro.retrofit.RetrofitHelper
import `in`.fittro.retrofit.safeApiCall
import kotlinx.coroutines.Dispatchers

class RegistrationRepository {

    suspend fun registration(
        name: String,
        email: String,
        password: String,
        gender: String,
        mobileNumber: String
    ): ResultWrapper<RegistrationResponse> {
        return safeApiCall(Dispatchers.IO) {
            RetrofitHelper.fittroApis.registration(
                name = name,
                email = email,
                password = password,
                gender = gender,
                mobileNumber = mobileNumber
            )
        }
    }

}