package com.example.hw05.task2

fun applyTwice(n: Int, operation: (Int) -> Int): Int {
    return operation(operation(n))
}

fun printIf(items: List<String>, condition: (String) -> Boolean) {
    items.forEach { item ->
        if (condition(item)) {
            println(item)
        }
    }
}

fun <T> transform(list: List<T>, mapper: (T) -> String): List<String> {
    return list.map { mapper(it) }
}

fun main() {
    val double: (Int) -> Int = { it * 2 }
    println(applyTwice(3, double))

    val courses = listOf("Algorithms", "Operating Systems", "Artificial Intelligence", "Databases", "English")
    val startsWithVowel: (String) -> Boolean = { str ->
        str.firstOrNull()?.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u')
    }
    printIf(courses, startsWithVowel)

    val numbers = listOf(2, 3, 4)
    val squaredStrings = transform(numbers) { (it * it).toString() }
    println(squaredStrings)
}