package com.example.hw05.task5

import com.example.hw05.task3.Student

fun main() {
    val students = listOf(
        Student("Ali", 85, 2023),
        Student("Budi", 62, 2022),
        Student("Citra", 91, 2023),
        Student("Dewi", 58, 2022),
        Student("Eka", 76, 2023)
    )

    val (passing, failing) = students.partition { it.score >= 70 }
    println("Passing: ${passing.size}   Failing: ${failing.size}")

    students.maxByOrNull { it.score }?.let {
        println("Top scorer : ${it.name} (${it.score})")
    }
    students.minByOrNull { it.score }?.let {
        println("Low scorer : ${it.name} (${it.score})")
    }

    val totalScore = students.fold(0) { sum, student -> sum + student.score }
    val average = totalScore.toDouble() / students.size
    println("Class average: ${"%.1f".format(average)}")

    val report = buildString {
        appendLine("--- Grade Report ---")
        students.forEach { student ->
            val status = if (student.score >= 70) "PASS" else "FAIL"
            appendLine("%-8s %-3d %s".format(student.name, student.score, status))
        }
    }
    print(report)
}