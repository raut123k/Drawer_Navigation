package com.krcoding.drawernavigation

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform