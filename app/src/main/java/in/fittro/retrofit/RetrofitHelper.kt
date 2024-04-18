package `in`.fittro.retrofit

import android.widget.Toast
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitHelper {

    private const val BASE_URL = "http://10.0.2.2:8000/"

    lateinit var fittroApis: FittroApis

    init {
        createApiService()
    }

    private fun createApiService()
    {

        val retrofitInstance = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        fittroApis = retrofitInstance.create(FittroApis::class.java)
    }



}