package com.example.language.api
import com.example.language.models.DashboardResponse
import com.example.language.models.LoginRequest
import com.example.language.models.LoginResponse
import retrofit2.http.POST
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiService {
    //    Login endpoints
    @POST("/sydney/auth")
    fun userLogin(@Body loginRequest: LoginRequest): Call<LoginResponse>

    //    Dashboard endpoints
    @GET("/dashboard/languages")
    fun getEntities(): Call<DashboardResponse>
}
