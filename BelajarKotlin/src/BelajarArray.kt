fun main() {
    val users: Array<String> = arrayOf("User 1", "User 2", "User 3")

    println(users[0])
    println(users.get(1))
    println(users[2])
    println()
    users[1] = "User 2 Update"
    println(users[1])
    users.set(2, "User 3 Update")
    println(users[2])
    println()
    println("Array users size : ${users.size}")
    println("")
}