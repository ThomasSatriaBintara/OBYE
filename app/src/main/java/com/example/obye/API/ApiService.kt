package com.example.obye.API

import com.example.obye.model.ResponseData
import com.example.obye.model.UserData
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("/predict")
    fun submitUserData(@Body requestData: UserData): Call<ResponseData>
}