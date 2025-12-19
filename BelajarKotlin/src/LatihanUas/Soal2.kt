package LatihanUas

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    launch {
        layaniPelanggan("Budi")
    }
    launch {
        layaniPelanggan("Susi")
    }
    launch {
        layaniPelanggan("Anto")
    }
}

fun layaniPelanggan(nama: String) {
    runBlocking {
        println("$nama sedang memesan...")
        delay(5000L)
        println("$nama selesai dilayani")
    }
}