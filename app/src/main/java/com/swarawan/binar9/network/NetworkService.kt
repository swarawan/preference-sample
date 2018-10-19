package com.swarawan.binar9.network

import com.swarawan.binar9.model.request.StudentRequest
import com.swarawan.binar9.model.response.StudentPostResponse
import com.swarawan.binar9.model.response.StudentResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

/**
 * Created by Rio Swarawan on 10/19/18.
 */
interface NetworkService {

    @GET("/api/v1/student/all")
    fun getAll(): Call<StudentResponse>

    @POST("/api/v1/student")
    fun add(@Body request: StudentRequest): Call<StudentPostResponse>
}