package com.example.hw05.task1

fun main() {
    val double: (Int) -> Int = { it * 2 }
    println(double(7))

    val startsWithVowel: (String) -> Boolean = { str ->
        str.firstOrNull()?.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u')
    }
    println(startsWithVowel("apple"))
    println(startsWithVowel("Banana"))
    println(startsWithVowel("orange"))

    val maxOfTwo: (Int, Int) -> Int = { a, b -> if (a > b) a else b }
    println(maxOfTwo(12, 7))
}