package fixingthebilliondollarmistake

import javafromkotlin.Developer

class Student(var favoriteSubject: String = "Programming")

fun main(args: Array<String>) {
    val subject = listOf("CS", "Math", "Physics")
    val student: Student? = null
    student?.favoriteSubject = subject[0]
}