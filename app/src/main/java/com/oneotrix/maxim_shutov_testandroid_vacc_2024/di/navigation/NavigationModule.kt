package com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.navigation

import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.MainActivity
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.R
import dagger.Module
import dagger.Provides

@Module
class NavigationModule {
    @Provides
    fun navigation(
        activity: MainActivity
    ): NavController {
        return Navigation.findNavController(activity, R.id.fragmentContainer)
    }
}