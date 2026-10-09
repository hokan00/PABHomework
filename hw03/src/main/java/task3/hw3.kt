package com.example.hw03.task3

fun printStudentInfo(studentName: String?) {
    println("Length: ${studentName?.length}")

    println("Name: ${studentName ?: "Unknown"}")

    studentName?.let { name ->
        println("Hello, $name!")
    }
}

fun main() {
    var studentName: String? = null
    printStudentInfo(studentName)

    println()

    studentName = "Ayu"
    printStudentInfo(studentName)
}