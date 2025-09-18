fun main() {
    val firstUser: Triple<String, Int, Boolean> = Triple(first = "User 1", second = 10, third = false)
    println(firstUser.first)
    println(firstUser.second)
    println(firstUser.third)

    val (username, age, status) = firstUser
    println(username)
    println(age)
    println(status)
}