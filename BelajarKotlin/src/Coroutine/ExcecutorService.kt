package Coroutine

import java.util.concurrent.Executors

fun main() {
//    val excecutor = Executors.newFixedThreadPool(10)
//    val excecutor = Executors.newCachedThreadPool()
    val excecutor = Executors.newSingleThreadExecutor()

    for (i in 1..10) {
        excecutor.submit {
            val threadName = Thread.currentThread().name

            println("Tugas $i berjalan di thread $threadName")

            Thread.sleep(1000)
        }
    }

    excecutor.shutdown()
}