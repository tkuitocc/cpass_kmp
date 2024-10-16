package org.itocc.cpass

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform