fun main() {
    val isLogggedIn = false

    if (isLogggedIn && (5 / 0 == 0)) {
        println("User has access")
    } else {
        println("Access denied")
    }

    if (isLogggedIn || (5 / 0 == 0)) {
        println("User has access")
    } else {
        println("Access denied")
    }
}