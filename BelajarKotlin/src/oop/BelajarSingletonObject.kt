package oop

object DatabaseConnection {
    fun connect() {
        println("Connecting to database...")
    }

    fun disconnect() {
        println("Disconnecting from database...")
    }
}

fun main() {
    DatabaseConnection.connect()
    DatabaseConnection.disconnect()
}