package oop

data class User(val name:String, var age:Int)

fun main() {
    val firstUser = User("Jovansa", 21)
    println(firstUser)

    val userCopy = firstUser.copy(age = 32)
    println(userCopy)
}