package pe.edu.upeu.proyectovcmjc.data.remote

import pe.edu.upeu.proyectovcmjc.modelo.*
import retrofit2.Response
import retrofit2.http.*

interface RestDataSource {
    @GET("/apiv1/persona")
    suspend fun reportarPersona(@Header("Autorization") token: String):Response<MsgModelResponse>

    @GET("/apiv1/peronsa/{id}")
    suspend fun getPersonaId(@Header("Autorization") token: String,
                             @Query("id") id: Int):Response<MsgModelResponse>

    @DELETE("/apiv1/persona")
    suspend fun deletePersona(@Path("id") id: Int):Response<MsgModelResponse>

    @PATCH("/apiv1/persona")
    suspend fun actualizarPersona(@Body persona: Persona):Response<MsgModelResponse>

    @POST("/apiv1/persona")
    suspend fun insertarPersona(@Body persona: Persona):Response<MsgModelResponse>

    @GET("/api/auth/login")
    suspend fun login(@Body user: User):Response<TokenResponse>
}