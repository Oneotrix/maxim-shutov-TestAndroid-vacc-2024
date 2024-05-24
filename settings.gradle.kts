pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("core") {
            from(files("version-catalog/core.toml"))
        }
        create("network") {
            from(files("version-catalog/network.toml"))
        }
        create("asynchronous") {
            from(files("version-catalog/asynchronous.toml"))
        }
        create("ioc") {
            from(files("version-catalog/ioc.toml"))
        }
    }
}

rootProject.name = "maxim-shutov-TestAndroid-vacc-2024"
include(":app")
 