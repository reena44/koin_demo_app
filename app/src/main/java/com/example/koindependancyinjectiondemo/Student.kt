package com.example.koindependancyinjectiondemo

class Student(private val course: Course, private val friend: Friend) {

    fun doCourse(): String =
        course.study()

    fun doPlay(): String =
        friend.play()
}

class Friend {
    fun play(): String = "I am playing with my friend"
}

class Course {
    fun study(): String = "I am studying"
}