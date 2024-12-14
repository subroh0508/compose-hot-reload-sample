package net.subroh0508.hotreload.sample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform