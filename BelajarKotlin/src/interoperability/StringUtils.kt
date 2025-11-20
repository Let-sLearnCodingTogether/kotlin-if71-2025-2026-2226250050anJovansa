package interoperability

fun isEmail(text: String): Boolean {
    return "@" in text
}