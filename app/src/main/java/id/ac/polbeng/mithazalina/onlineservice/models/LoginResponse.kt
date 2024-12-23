package id.ac.polbeng.mithazalina.onlineservice.models

data class LoginResponse (
   val message: String,
    val error: Boolean,
    val data: User
)
