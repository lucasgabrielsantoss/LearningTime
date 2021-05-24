object Libs {


    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlinVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Version.appCompatVersion}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintLayoutVersion}"
    const val material = "com.google.android.material:material:${Version.materialVersion}"
    const val core = "androidx.core:core-ktx:${Version.coreVersion}"
    // RxJava / RxAndroid / RxBinding
    const val rxJava2 = "io.reactivex.rxjava2:rxjava:${Version.rxJavaVersion}"
    const val rxJava2Android = "io.reactivex.rxjava2:rxandroid:${Version.rxAndroidVersion}"
    const val rxJava2Reley = "com.jakewharton.rxrelay2:rxrelay:${Version.rxRelayVersion}"
    const val rxJava2Binding = "com.jakewharton.rxbinding2:rxbinding-support-v4:${Version.rxbindingVersion}" // Available RxBinding3
    // Navigation
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Version.navigationVersion}"
    const val navigationRuntime = "androidx.navigation:navigation-runtime-ktx:${Version.navigationVersion}"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Version.navigationVersion}"
    // Koin
    const val koinCore = "org.koin:koin-core:${Version.koinVersion}"
    const val koinAndroid = "org.koin:koin-android:${Version.koinVersion}"
    const val koinScope = "org.koin:koin-android-scope:${Version.koinVersion}"
    const val koinViewModel = "org.koin:koin-androidx-viewmodel:${Version.koinVersion}"
    // LifeCycle
    const val lifecycleeExtension = "androidx.lifecycle:lifecycle-extensions:${Version.lifecycleVersion}"
    const val lifecycleReactiveStreams = "androidx.lifecycle:lifecycle-reactivestreams:${Version.lifecycleVersion}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime:${Version.lifecycleVersion}"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Version.lifecycleVersion}"
    const val lifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycleVersion}"
    const val lifecycleLiveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycleVersion}"
    const val lifecycleProcess = "androidx.lifecycle:lifecycle-process:${Version.lifecycleVersion}"
    // Room
    const val room = "androidx.room:room-runtime:${Version.roomVersion}"
    const val kaptRoom = "androidx.room:room-compiler:${Version.roomVersion}"
    // Retrofit
    const val gson = "com.google.code.gson:gson:2.8.6"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofitVersion}"
    const val rxjava2 = "com.squareup.retrofit2:adapter-rxjava2:${Version.retrofitVersion}"
    const val convertergson = "com.squareup.retrofit2:converter-gson:${Version.retrofitVersion}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Version.okhttpVersion}"
    const val mockwebserver = "com.squareup.okhttp3:mockwebserver:${Version.okhttpVersion}"
    //Google Services
    const val locationService= "com.google.android.gms:play-services-location:${Version.locationServiceVersion}"
    const val auth = "com.google.android.gms:play-services-auth:${Version.authVersion}"
    const val baseClientLibrary = "com.google.android.gms:play-services-base:${Version.baseClientLibraryVersion}"
    const val identity = "com.google.android.gms:play-services-identity:${Version.identityVersion}"
    // Coroutines
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutinesManager}"
}
