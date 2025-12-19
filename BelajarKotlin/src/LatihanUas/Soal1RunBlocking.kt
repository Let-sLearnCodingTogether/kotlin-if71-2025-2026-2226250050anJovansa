package LatihanUas

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Mulai")
    downloadData()
    println("Selesai")
}

suspend fun downloadData() {
    println("Download Data")
    delay(3000)
}