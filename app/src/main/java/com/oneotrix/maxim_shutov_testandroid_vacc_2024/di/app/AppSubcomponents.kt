package com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.app

import com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.navigation.NavigationComponent
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.products.ProductsComponent
import dagger.Module

@Module(subcomponents = [
    NavigationComponent::class,
    ProductsComponent::class
])
class AppSubcomponents