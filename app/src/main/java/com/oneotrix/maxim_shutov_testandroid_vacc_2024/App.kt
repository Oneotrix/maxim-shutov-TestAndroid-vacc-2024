package com.oneotrix.maxim_shutov_testandroid_vacc_2024

import android.app.Application
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.app.AppComponent
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.app.DaggerAppComponent
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.navigation.NavigationComponent
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.products.ProductsComponent

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.factory()
            .create(this@App)

        navigationComponentFactory = appComponent.provideNavigationComponentFactory()

        productsComponent = appComponent.provideProductsComponentBuilder()
            .build()
    }


    companion object {
        private lateinit var appComponent: AppComponent
        lateinit var navigationComponentFactory: NavigationComponent.Factory
        lateinit var productsComponent : ProductsComponent

    }
}