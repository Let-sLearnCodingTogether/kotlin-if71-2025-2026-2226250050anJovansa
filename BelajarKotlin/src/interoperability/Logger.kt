package interoperability

class Logger {
    @JvmOverloads
    fun log(massage: String, level: String = "INFO") {
        println("[$level] $massage")
    }
}