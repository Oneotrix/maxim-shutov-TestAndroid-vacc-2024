package com.oneotrix.maxim_shutov_testandroid_vacc_2024.data

import com.oneotrix.maxim_shutov_testandroid_vacc_2024.data.network.ProductsNetModel
import retrofit2.http.GET

interface Api {
    @GET("api/json/v1/1/search.php?s")
    suspend fun getMealsList() : ProductsNetModel

    companion object {
        const val BASE_URL = "http://themealdb.com/"
    }
}