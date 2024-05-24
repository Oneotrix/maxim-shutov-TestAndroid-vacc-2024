package com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.app.modules

import android.content.Context
import com.squareup.picasso.OkHttp3Downloader
import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides
@Module
class PicassoModule {

    @Provides
    fun providePicasso(
        context: Context,
        okHttp3Downloader: OkHttp3Downloader
    ): Picasso {
        val picasso = Picasso.Builder(context)
            .downloader(okHttp3Downloader)
            .build()
        return picasso
    }
}