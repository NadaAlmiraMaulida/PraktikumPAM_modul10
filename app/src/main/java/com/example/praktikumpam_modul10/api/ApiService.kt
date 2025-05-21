package com.example.praktikumpam_modul10.api

import com.example.praktikumpam_modul10.model.AddMahasiswaResponse
import com.example.praktikumpam_modul10.model.MahasiswaResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query


interface ApiService {
    @GET("mahasiswa")
    fun getMahasiswa(@Query("nrp") nrp: String?): Call<MahasiswaResponse?>?

    @POST("mahasiswa")
    @FormUrlEncoded
    fun addMahasiswa(
        @Field("nrp") nrp: String?,
        @Field("nama") nama: String?,
        @Field("email") email: String?,
        @Field("jurusan") jurusan: String?
    ): Call<AddMahasiswaResponse?>?
}