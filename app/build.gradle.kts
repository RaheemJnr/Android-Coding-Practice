plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.codingexercise"
    compileSdk = ConfigData.compileSdkVersion

    defaultConfig {
        applicationId = "com.example.codingexercise"
        minSdk = ConfigData.minSdkVersion
        targetSdk = ConfigData.targetSdkVersion
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName

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

    implementation(Dependencies.androidXCore)
    implementation(Dependencies.androidXLifecycleRuntime)
    implementation(Dependencies.androidXActivityCompose)
    implementation(platform(Dependencies.composeBOM))
    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeUiGraphics)
    implementation(Dependencies.composeToolingPreview)
    implementation(Dependencies.composeMaterial3)


    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.androidxJunit)
    androidTestImplementation(Dependencies.androidxEspressoCore)
    androidTestImplementation (platform (Dependencies.androidxTestBOM))
    androidTestImplementation(Dependencies.androidxUiTest)
    debugImplementation(Dependencies.androidxUiToolingTest)
    debugImplementation(Dependencies.androidxUiTestManifest)

    implementation(project(":module_1"))
    implementation(project(":networking"))
}