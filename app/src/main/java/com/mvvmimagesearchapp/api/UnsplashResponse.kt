package com.mvvmimagesearchapp.api

import com.mvvmimagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results : List<UnsplashPhoto>
)