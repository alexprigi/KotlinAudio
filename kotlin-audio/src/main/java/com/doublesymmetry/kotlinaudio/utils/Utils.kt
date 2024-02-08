@file: OptIn(UnstableApi::class) package com.doublesymmetry.kotlinaudio.utils

import android.content.ContentResolver
import android.net.Uri
import androidx.annotation.OptIn
import androidx.media3.common.util.UnstableApi
import androidx.media3.datasource.RawResourceDataSource

fun isUriLocal(uri: Uri?): Boolean {
    if (uri == null) return false
    val scheme = uri.scheme
    val host = uri.host
    return scheme == null || scheme == ContentResolver.SCHEME_FILE || scheme == ContentResolver.SCHEME_ANDROID_RESOURCE || scheme == ContentResolver.SCHEME_CONTENT || scheme == RawResourceDataSource.RAW_RESOURCE_SCHEME || scheme == "res" || host == null || host == "localhost" || host == "127.0.0.1" || host == "[::1]"
}