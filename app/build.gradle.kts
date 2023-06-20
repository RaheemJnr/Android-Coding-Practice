plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
//    kotlin("android")
}

android {
    namespace = "com.example.codingexercise"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.codingexercise"
        minSdk = 25
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
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

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }


//    kotlinOptions {
//        jvmTarget = '1.8'
//    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Deps.androidXCore)
    implementation(Deps.androidXLifecycleRuntime)
    implementation(Deps.androidXActivityCompose)
    implementation(platform(Deps.composeBOM))
    implementation(Deps.composeUi)
    implementation(Deps.composeUiGraphics)
    implementation(Deps.composeToolingPreview)
    implementation(Deps.composeMaterial3)


    testImplementation(Deps.junit)
    androidTestImplementation(Deps.androidxJunit)
    androidTestImplementation(Deps.androidxEspressoCore)
    androidTestImplementation (platform (Deps.androidxTestBOM))
    androidTestImplementation(Deps.androidxUiTest)
    debugImplementation(Deps.androidxUiToolingTest)
    debugImplementation(Deps.androidxUiTestManifest)
}