package oop

interface Vehicle {
    fun accelerate()
    fun stop()
}

class Unicycle : Vehicle {
    override fun accelerate() {
        println("Accelerate")
    }

    override fun stop() {
        println("Stop")
    }

}


interface ConrateInterface {
    fun normalFun()
    fun conrateFun() {
        println("Kalau fun ada body, maka fun tersebut tidak wajib diturunkan")
    }
}

class BelajarConrate : ConrateInterface {
    override fun normalFun() {
        println("Normal fun")
    }

}

interface PropertiesInterface {
    val weight: Int
    val height: Int
        get() = 11
}

class BelajarPropertiesInterface(override val weight: Int) : PropertiesInterface {
    override val height: Int = 168
}

class BelajarMultiInterface(override val weight: Int) : PropertiesInterface, ConrateInterface {
    override fun normalFun() {
        println("Multi interface implement")
    }

}

interface PaymentMethod {
    fun payment()
}

interface Refund : PaymentMethod {
    fun refund()
}

class Bank : Refund {
    override fun refund() {
        println("Refund")
    }

    override fun payment() {
        println("Pay")
    }

}

interface MoveA {
    fun move() = println("MoveA")
}

interface MoveB {
    fun move() = println("MoveB")

}

class MoveC : MoveA, MoveB {
    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
    }
}

fun main() {
    val motor = Unicycle()
    motor.accelerate()
    motor.stop()

    val conObj = BelajarConrate()
    conObj.normalFun()
    conObj.conrateFun()

    val proObj = BelajarPropertiesInterface(10)
    println(proObj.weight)
    println(proObj.height)

    val multiObj = BelajarMultiInterface(1)
    multiObj.normalFun()

    val bankA = Bank()
    bankA.payment()
    bankA.refund()

    val mov = MoveC()
    mov.move()
}