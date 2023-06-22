/**
 * To define plugins
 */
object BuildPlugins {

}

/**
 * To define dependencies
 */
object Dependencies {
    val timber by lazy { "com.jakewharton.timber:timber:${Versions.timber}" }

    val junit by lazy { "junit:junit:${Versions.jUnit}" }
    val androidxJunit by lazy { "androidx.test.ext:junit:${Versions.androidxJunit}" }
    val androidxEspressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.androidxEspressoCore}" }
    val androidxTestBOM by lazy { "androidx.compose:compose-bom:${Versions.androidxTestBOM}" }
    val androidxUiTest by lazy { "androidx.compose.ui:ui-test-junit4" }
    val androidxUiToolingTest by lazy { "androidx.compose.ui:ui-tooling" }
    val androidxUiTestManifest by lazy { "androidx.compose.ui:ui-test-manifest" }

    //
    val androidXCore by lazy { "androidx.core:core-ktx:${Versions.androidXCore}" }
    val androidXLifecycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${}" }
    val androidXActivityCompose by lazy { "androidx.activity:activity-compose:1.5.1" }
    val composeBOM by lazy { "androidx.compose:compose-bom:2022.10.00" }
    val composeUi by lazy { "androidx.compose.ui:ui" }
    val composeUiGraphics by lazy { "androidx.compose.ui:ui-graphics" }
    val composeToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview" }
    val composeMaterial3 by lazy { "androidx.compose.material3:material3" }

}