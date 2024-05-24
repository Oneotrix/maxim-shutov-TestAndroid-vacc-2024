package com.oneotrix.maxim_shutov_testandroid_vacc_2024

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.databinding.ActivityMainBinding
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.navigation.NavigationComponent

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        navigationComponent = App.navigationComponentFactory
            .create(this@MainActivity)

    }


    companion object {

        lateinit var navigationComponent: NavigationComponent

    }
}