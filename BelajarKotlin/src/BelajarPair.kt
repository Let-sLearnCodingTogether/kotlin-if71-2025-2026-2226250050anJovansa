fun main() {
    val firstUser: Pair<String, Int> = Pair(first = "User 1", second = 10)
    println(firstUser.first)
    println(firstUser.second)

    val secondUser: Pair<String, Int> = "User 2" to 20
    println(secondUser.first)
    println(secondUser.second)

    val thirdUser = "User 3" to 30
    println(thirdUser.first)
    println(thirdUser.second)

    val (username, age) = firstUser
    println(username)
    println(age)
}