package `in`.fittro.retrofit

import com.squareup.moshi.Moshi
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import java.io.IOException

suspend fun <T> safeApiCall(
    dispatcher: CoroutineDispatcher,
    apiCall: suspend () -> T,
): ResultWrapper<T> {
    return withContext(dispatcher) {
        try {
            ResultWrapper.Success(apiCall.invoke())
        } catch (throwable: Throwable) {
           // Timber.e(throwable)
            when (throwable) {
                is IOException -> ResultWrapper.NetworkError
                is HttpException -> {
                    val code = throwable.code()
                    val errorResponse = convertErrorBody(throwable)
                    ResultWrapper.GenericError(code, errorResponse)
                }
                else -> {
                    ResultWrapper.GenericError(null, null)
                }
            }
        }
    }
}

private fun convertErrorBody(throwable: HttpException): ErrorResponse? {
    return try {
        throwable.response()?.errorBody()?.source()?.let {
            //Timber.e(it.toString())

            val moshi = Moshi.Builder().build()
            val errorAdapter = moshi.adapter(ErrorResponse::class.java)
            val errorResponse = errorAdapter.fromJson(it)
            errorResponse
        }
    } catch (exception: Exception) {
        null
    }
}