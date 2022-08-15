package com.sample.network.remote

import com.sample.data.WeatherResponse
import com.sample.network.BuildConfig
import com.sample.network.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RemoteAPIService {
    @GET(Constants.WEATHER_FORECAST_ENDPOINT)
    suspend fun getWeatherReport(
        @Query("q") q: String,
        @Query("appid") appId: String = BuildConfig.API_KEY
    ): Response<WeatherResponse>
}
