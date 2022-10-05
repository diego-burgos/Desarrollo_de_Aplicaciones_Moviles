package pe.edu.upeu.proyectovcmjc.modelo

import java.sql.ClientInfoStatus

data class User(
    var name: String,
    var email: String,
    var password: String
)
data class UserResponse(
    var message: String
)

data class TokenResponse(
    var message: String,
    var token: String
)
