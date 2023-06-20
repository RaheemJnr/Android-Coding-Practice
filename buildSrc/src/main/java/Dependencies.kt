/**
 * To define plugins
 */
object BuildPlugins {
    val android by lazy { "com.android.tools.build:gradle:${Versions.gradlePlugin}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}" }
}

/**
 * To define dependencies
 */
object Deps {
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val timber by lazy { "com.jakewharton.timber:timber:${Versions.timber}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}" }
    val junit by lazy { "junit:junit:4.13.2" }
    val androidxJunit by lazy { "androidx.test.ext:junit:1.1.5" }
    val androidxEspressoCore by lazy { "androidx.test.espresso:espresso-core:3.5.1" }
    val androidxTestBOM by lazy { "androidx.compose:compose-bom:2022.10.00" }
    val androidxUiTest by lazy { "androidx.compose.ui:ui-test-junit4" }
    val androidxUiToolingTest by lazy { "androidx.compose.ui:ui-tooling" }
    val androidxUiTestManifest by lazy { "androidx.compose.ui:ui-test-manifest" }


    //
    val androidXCore by lazy { "androidx.core:core-ktx:1.8.0" }
    val androidXLifecycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1" }
    val androidXActivityCompose by lazy { "androidx.activity:activity-compose:1.5.1" }
    val composeBOM by lazy { "androidx.compose:compose-bom:2022.10.00" }

    val composeUi by lazy { "androidx.compose.ui:ui" }
    val composeUiGraphics by lazy { "androidx.compose.ui:ui-graphics" }
    val composeToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview" }
    val composeMaterial3 by lazy { "androidx.compose.material3:material3" }

}