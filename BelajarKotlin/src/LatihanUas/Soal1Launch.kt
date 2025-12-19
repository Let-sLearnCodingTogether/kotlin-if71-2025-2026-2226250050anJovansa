package LatihanUas

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Mulai")
    launch { downloadData1() }
    println("Selesai")
}

suspend fun downloadData1() {
    println("Download Data")
    delay(3000)
}