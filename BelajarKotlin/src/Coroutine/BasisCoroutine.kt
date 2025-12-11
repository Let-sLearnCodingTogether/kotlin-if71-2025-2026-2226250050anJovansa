package Coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Aplikasi dimulai")
    launch {
        updateVersion()
    }
    login()
    println("Pindah halaman dari login, ke home")
}

suspend fun login() {
    println("Melakukan validasi email & password")
    delay(2000)
    println("Validasi sukses")
}

suspend fun updateVersion() {
    delay(5000)
    println("Update selesai")
}