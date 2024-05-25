package com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.app.modules

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.data.Api
import dagger.Module
import dagger.Provides
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Converter
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class RetrofitModule {
    @Provides
    fun apiService(retrofit: Retrofit): Api {
        return retrofit.create(Api::class.java)
    }

    @Provides
    @Singleton
    fun retrofitService(
        convertedFactory: Converter.Factory,
        okHttpClient: OkHttpClient
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Api.BASE_URL)
            .addConverterFactory(convertedFactory)
            .client(okHttpClient)
            .build()
    }

    @Provides
    fun jsonConvertedFactory(json: Json, contentType: MediaType): Converter.Factory {
        return json.asConverterFactory(contentType)
    }

    @Provides
    fun json(): Json {
        return Json
    }

    @Provides
    fun contentType(): MediaType {
        return "application/json".toMediaType()
    }
}