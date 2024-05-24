package com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.app.modules

import android.util.Log
import com.squareup.picasso.OkHttp3Downloader
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
@Module
class OkHttpModule {
    @Provides
    fun okHttpClient(
        interceptor: HttpLoggingInterceptor
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()
    }

    @Provides
    fun okHttp3Downloader(okHttpClient: OkHttpClient): OkHttp3Downloader {
        return OkHttp3Downloader(okHttpClient)
    }

    @Provides
    fun loggingInterceptor(): HttpLoggingInterceptor {
        val interceptor = HttpLoggingInterceptor { message -> Log.d("OkHttp", message) }
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }
}