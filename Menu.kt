package com.example.chapter2

open class Menu(name: String, description: String) {
    var name: String
    var description: String
    init {
        this.name = name
        this.description = description
    }

    open fun displatInfo() {
        println("이름: ${name}, 설명: ${description}")
    }
}