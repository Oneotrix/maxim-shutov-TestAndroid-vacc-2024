package com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.app

import android.content.Context
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.app.modules.OkHttpModule
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.app.modules.PicassoModule
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.app.modules.RepositoryModule
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.app.modules.RetrofitModule
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.navigation.NavigationComponent
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.products.ProductsComponent
import com.squareup.picasso.Picasso
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        AppSubcomponents::class,
        RetrofitModule::class,
        OkHttpModule::class,
        PicassoModule::class,
        RepositoryModule::class
    ]
)
@Singleton
interface AppComponent {

    fun provideNavigationComponentFactory() : NavigationComponent.Factory

    fun provideProductsComponentBuilder() : ProductsComponent.Builder

    fun providePicasso(): Picasso

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context
        ) : AppComponent
    }
}