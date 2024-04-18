package `in`.fittro.management.onboarding.auth.repository

import android.util.Log
import `in`.fittro.management.onboarding.auth.response.LoginResponse
import `in`.fittro.retrofit.ResultWrapper
import `in`.fittro.retrofit.RetrofitHelper
import `in`.fittro.retrofit.safeApiCall
import kotlinx.coroutines.Dispatchers
import timber.log.Timber

class LoginRepository {

    suspend fun login(email: String, password: String): ResultWrapper<LoginResponse> {
        return safeApiCall(Dispatchers.IO) {
            RetrofitHelper.fittroApis.login(email = email, password = password)
        }
    }

}