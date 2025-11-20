package Latihan

interface Electronic {
    val brand: String
    fun turnOn()
    fun turnOff()
    fun cleanDrive() {
        println("Membersihkan debu dari perangkat $brand")
    }
}

class Fan(override val brand: String) : Electronic {
    override fun turnOn() {
        println("Kipas angin merek $brand berputar")
    }

    override fun turnOff() {
        println("Kipas angin merek $brand berhenti")
    }
}

class SmartLight(override val brand: String) : Electronic {
    override fun turnOn() {
        println("Lampu merek $brand hidup")
    }

    override fun turnOff() {
        println("Lampu merek $brand mati")
    }

}

fun main() {
    val lg = Fan("LG")
    lg.turnOn()
    lg.turnOff()
    lg.cleanDrive()
    println()
    val bardi = SmartLight("bardi")
    bardi.turnOn()
    bardi.turnOff()
    bardi.cleanDrive()
}