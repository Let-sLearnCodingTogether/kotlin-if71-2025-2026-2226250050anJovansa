package interoperability

class Database {
    companion object {
        @JvmStatic
        fun getConnectionUrl(): String {
            return "db connection url"
        }
    }
}