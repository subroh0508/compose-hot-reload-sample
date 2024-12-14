package net.subroh0508.hotreload.sample

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "hot-reload-sample",
    ) {
        App()
    }
}