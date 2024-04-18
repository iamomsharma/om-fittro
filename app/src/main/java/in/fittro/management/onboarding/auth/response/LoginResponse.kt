package `in`.fittro.management.onboarding.auth.response


import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("access")
    val access: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("refresh")
    val refresh: String,
    @SerializedName("uuid")
    val uuid: String
)