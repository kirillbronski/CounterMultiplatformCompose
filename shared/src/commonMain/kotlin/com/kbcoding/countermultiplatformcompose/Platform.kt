package com.kbcoding.countermultiplatformcompose

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform