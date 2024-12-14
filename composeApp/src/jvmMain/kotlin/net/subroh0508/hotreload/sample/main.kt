package net.subroh0508.hotreload.sample

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.jetbrains.compose.reload.DevelopmentEntryPoint

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "hot-reload-sample",
    ) {
        DevelopmentEntryPoint {
            App()
        }
    }
}