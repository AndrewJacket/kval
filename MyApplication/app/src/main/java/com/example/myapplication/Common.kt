package com.example.myapplication

object Common {
    private val BASE_URL = "http:/10.0.2.2:10001"
    val retrofitService: RetrofitService
    get() = RetrofitClient.getClient(BASE_URL)
        .create(RetrofitService::class.java)
}