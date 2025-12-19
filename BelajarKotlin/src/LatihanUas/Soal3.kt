package LatihanUas

import Stack.StackImplement

interface Stack<Element> {
    fun push(element: Element)
    fun pop(): Element?
    fun peek(): Element?
}

class NilaiAkhir<T : Any> : Stack<T> {
    private val storage = arrayListOf<T>()

    override fun toString(): String {
        return storage.asReversed().toString()
    }

    override fun push(element: T) {
        storage.add(element)
    }

    override fun pop(): T? {
        if (storage.isEmpty()) return null
        return storage.removeAt(storage.size - 1)
    }

    override fun peek(): T? {
        if (storage.isEmpty()) return null
        return storage.last()
    }
}

fun main() {
    val stack = NilaiAkhir<Int>()
    stack.push(10)
    stack.push(20)
    stack.pop()
    stack.push(1)
    println(stack.peek())
    println(stack)
}