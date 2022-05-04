package com.example.myapplication

interface RetrofitService {
    @GET ("/")
    fun getList (@Query ("input")input:String): Call<Rest>
}