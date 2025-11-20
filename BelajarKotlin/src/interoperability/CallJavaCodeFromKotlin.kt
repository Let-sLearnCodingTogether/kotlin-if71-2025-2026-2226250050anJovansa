package interoperability

fun main() {
    val user1 = UserClass()

    user1.name = "User 1"

    println(user1.name)

    val counter1 = CounterClass()

    counter1.increment()
    println(counter1.number)
}