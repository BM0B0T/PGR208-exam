package com.example.pgr208_2021_android_exam.data

import com.example.pgr208_2021_android_exam.data.domain.Crypto
import com.example.pgr208_2021_android_exam.data.domain.CryptoCurrency
import com.example.pgr208_2021_android_exam.data.domain.CryptoData
import com.example.pgr208_2021_android_exam.data.domain.CryptoListData
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinCapService {
    //Gets all list of all crypto
    @GET("assets")
    suspend fun getAllCrypto(): CryptoListData

    //Gets selected crypto
    @GET("assets/{id}")
    suspend fun getCryptoById(@Path("id") id: String): CryptoData
}