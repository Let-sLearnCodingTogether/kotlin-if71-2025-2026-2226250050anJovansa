package LinkedList

data class Node<T : Any>(var value: T, var next: Node<T>? = null) {
    override fun toString(): String {
        return if (next == null) {
            "$value"
        } else {
            "$value -> ${next.toString()}"
        }
    }
}

class LinkedListIterator<T : Any>(private val list: LinkedList<T>) : Iterator<T> {
    private var index = 0
    private var lastNode: Node<T>? = null
    override fun next(): T {
        TODO("Not yet implemented")
    }

    override fun hasNext(): Boolean {
        return index < list.size
        TODO("Not yet implemented")
    }
}

class LinkedList<T : Any> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    var size = 0
        private set

    fun isEmpty(): Boolean = size == 0

    override fun toString(): String {
        return if (isEmpty()) {
            "Empty list"
        } else {
            head.toString()
        }
    }

    fun push(value: T): LinkedList<T> = apply {
        head = Node(value, head)

        if (tail == null) {
            tail = head
        }
        size++
    }

    fun pop(): T? {
        if (isEmpty()) return null

        val result = head?.value
        head = head?.next
        size--
        if (isEmpty()) {
            tail = null
        }
        return result
    }

    fun append(value: T) {
        if (isEmpty()) {
            push(value)
            return
        }

        val newNode = Node(value)
        tail!!.next = newNode
        tail = newNode

        size++
    }

    fun nodeAt(index: Int): Node<T>? {
        var currentNode = head
        var currentIndex = 0

        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode
    }

    fun insert(value: T, afterNode: Node<T>?): Node<T> {
        if (tail == afterNode) {
            append(value)
            return tail!!
        }

        val newNode = Node(value, afterNode?.next)
        afterNode?.next = newNode
        size++
        return newNode
    }

    fun removeLast(): T? {
        var head = head ?: return null
        if (head.next == null) return pop()

        size--
        var prev = head
        var current = head
        var next = current.next

        while (next != null) {
            prev = current
            current = next
            next = current.next
        }

        prev.next = null
        tail = prev
        return current.value
    }

    fun removeAfter(node: Node<T>?): T? {
        val result = node?.next?.value

        if (node?.next == tail) {
            tail = node
        }

        if (node?.next != null) {
            size--
        }

        node?.next = node.next?.next
        return result
    }
}

fun main() {
    println("Test Node data class")
    val node1 = Node(12)
    val node2 = Node(1)
    val node3 = Node(3)

    node1.next = node2
    node2.next = node3

    println(node1)
    println("-------------------------")
    var list = LinkedList<Int>()
    println("Test LinkedList Push")
    println(list)
    list.push(1)
    println(list)
    list.push(2)
    println(list)
    list.push(3)
    println(list)
    println("Test LinkedList Pop")
    list.pop()
    println(list)
    list.pop()
    println(list)
    list.pop()
    println(list)
    println("Test LinkedList Append")
    list.append(1)
    println(list)
    list.append(2)
    println(list)
    list.append(3)
    println(list)
    println("Test LinkedList Insert")
    list.insert(0, list.nodeAt(1))
    println(list)
    println("Test LinkedList RemoveLast")
    list.removeLast()
    println(list)
    println("Test LinkedList RemoveAfter")
    list.removeAfter(list.nodeAt(0))
    println(list)
}