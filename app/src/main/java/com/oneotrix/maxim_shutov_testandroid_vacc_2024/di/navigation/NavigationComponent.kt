package com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.navigation

import androidx.navigation.NavController
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(
    modules = [
        NavigationModule::class
    ]
)
interface NavigationComponent {

    fun navigationController(): NavController

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance activity: MainActivity
        ) : NavigationComponent
    }

}