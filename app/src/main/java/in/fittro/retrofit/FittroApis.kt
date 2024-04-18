package `in`.fittro.retrofit

import `in`.fittro.management.onboarding.auth.response.LoginResponse
import `in`.fittro.management.onboarding.auth.response.RegistrationResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface FittroApis {

    @FormUrlEncoded
    @POST("auth/login/")
    suspend fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): LoginResponse

    @FormUrlEncoded
    @POST("auth/register/")
    suspend fun registration(
        @Field("name") name: String,
        @Field("email") email: String,
        @Field("password") password: String,
        @Field("gender") gender: String,
        @Field("mobile_number") mobileNumber: String
    ): RegistrationResponse


}