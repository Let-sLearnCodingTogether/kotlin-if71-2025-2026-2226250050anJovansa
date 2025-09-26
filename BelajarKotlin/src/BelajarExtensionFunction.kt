fun main() {
    val username: String = "Budi"
    val age:Int = 15

    println(username.greeting())
    println(age.isEven())
}

fun String.greeting(): String {
    return "Hello, $this"
}

fun Int.isEven(): Boolean{
    return this%2==0
}