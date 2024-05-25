package com.oneotrix.maxim_shutov_testandroid_vacc_2024.data

import com.oneotrix.maxim_shutov_testandroid_vacc_2024.data.network.MealNetModel
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.data.network.MealsNetModel
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("api/json/v1/1/search.php?s")
    suspend fun getMealsList() : MealsNetModel

    @GET("api/json/v1/1/lookup.php")
    suspend fun getMeal(
        @Query("i") i: String
    ) : MealsNetModel

    companion object {
        const val BASE_URL = "http://themealdb.com/"
    }
}