plugins {
    alias(core.plugins.androidApplication)
    alias(core.plugins.jetbrainsKotlinAndroid)
    alias(core.plugins.kotlin.serialization)
    alias(core.plugins.kotlin.kapt)
}

android {
    namespace = "com.oneotrix.maxim_shutov_testandroid_vacc_2024"
    compileSdk = core.versions.compileSdk.get().toInt()

    defaultConfig {
        applicationId = "com.oneotrix.maxim_shutov_testandroid_vacc_2024"
        minSdk = core.versions.minSdk.get().toInt()
        targetSdk = core.versions.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    kapt(ioc.dagger.compiler)

    // Network
    implementation(network.okhttp)
    implementation(network.okhttp.loggingInterceptor)
    implementation(network.retrofit)
    implementation(network.retrofit.kotlinx.serialization)

    // Navigation
    implementation(core.navigation.fragment)
    implementation(core.navigation.ui)

    // DI
    implementation(ioc.dagger.dagger)

    // Coroutines
    implementation(asynchronous.coroutines)

    // Serialization
    implementation(core.kotlinx.serializarion)

    implementation(core.androidx.core.ktx)
    implementation(core.androidx.appcompat)
    implementation(core.material)
    implementation(core.androidx.activity)
    implementation(core.androidx.constraintlayout)
    testImplementation(core.junit)
    androidTestImplementation(core.androidx.junit)
    androidTestImplementation(core.androidx.espresso.core)
}