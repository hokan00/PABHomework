package com.example.hw05.task3

data class Student(val name: String, val score: Int, val year: Int)

fun main() {
    val students = listOf(
        Student("Ali", 85, 2023),
        Student("Budi", 62, 2022),
        Student("Citra", 91, 2023),
        Student("Dewi", 58, 2022),
        Student("Eka", 76, 2023)
    )

    val passedStudents = students.filter { it.score >= 70 }
    println("Passed count: ${passedStudents.size}")

    students.map { "${it.name} (${it.score})" }
        .forEach { println(it) }

    val top3Names = students.sortedByDescending { it.score }
        .take(3)
        .map { it.name }
    println("Top 3: $top3Names")

    val totalScore = students.fold(0) { acc, student -> acc + student.score }
    val averageScore = totalScore.toDouble() / students.size
    println("Total: $totalScore  Average: $averageScore")

    students.groupBy { it.year }
        .forEach { (year, list) ->
            val names = list.map { it.name }
            println("$year: $names")
        }
}