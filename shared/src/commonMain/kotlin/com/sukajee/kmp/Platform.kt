package com.sukajee.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform