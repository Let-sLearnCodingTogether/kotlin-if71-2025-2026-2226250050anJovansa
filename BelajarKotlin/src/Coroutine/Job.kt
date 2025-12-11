package Coroutine

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Aplikasi dimulai")

    val job: Job = launch {
        updateVersion1()
    }

    println("Apakah job ini selesai ? ${job.isCompleted}")
    println("Apakah job ini berjalan ? ${job.isActive}")
    println("Apakah job ini dibatalkan ? ${job.isCancelled}")
    println("Pindah halaman dari login, ke home")
}

suspend fun updateVersion1() {
    delay(5000)
    println("Update selesai")
}