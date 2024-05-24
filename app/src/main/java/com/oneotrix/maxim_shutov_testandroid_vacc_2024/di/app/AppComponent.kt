package com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.app

import android.content.Context
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.navigation.NavigationComponent
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.products.ProductsComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        AppSubcomponents::class
    ]
)
@Singleton
interface AppComponent {

    fun provideNavigationComponentFactory() : NavigationComponent.Factory

    fun provideProductsComponentBuilder() : ProductsComponent.Builder

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context
        ) : AppComponent
    }
}