package Coroutine

import java.util.Date

fun main() {
    val runnable = Runnable {
        println(Date())
        Thread.sleep(2000)
        println("hello")
    }

    val thread0 = Thread(runnable)

    thread0.start()

    println("Program Selesai")
    val threadName = Thread.currentThread().name
    println(threadName)

    val thread1 = Thread {
        println(Thread.currentThread().name)
        Thread.sleep(2000)
        println("thread1")
    }

    val thread2 = Thread {
        println(Thread.currentThread().name)
        Thread.sleep(2000)
        println("thread2")
    }

    thread1.start()
    thread2.start()
}