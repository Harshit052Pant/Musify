package com.example.musify

import MyData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {

    @Headers("X-RapidAPI-Key: 8b671cc5bcmshe80d57df80ffd14p1e36aajsnfbb054db532b","X-RapidAPI-Host: deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    fun getData(@Query("q") query:String): Call<MyData>
}