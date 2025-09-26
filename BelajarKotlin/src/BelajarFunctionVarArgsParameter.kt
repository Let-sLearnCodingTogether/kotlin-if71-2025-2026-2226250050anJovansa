fun main() {
    val arrayUsers: Array<String> = arrayOf("User 1", "User 2")
    funcArray(arrayUsers)
    funcArrayVarArgs("Jovan", "User 1s", "User 2s")
}

fun funcArray(users: Array<String>) {
    for (user in users) {
        println(user)
    }
}

fun funcArrayVarArgs(name: String, vararg users: String) {
    println(name)
    for (user in users) {
        println(user)
    }
}