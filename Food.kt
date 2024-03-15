package com.example.chapter2

class Food(name: String, price: Double, catagoty: String, description: String): Menu(name, description) {
    var price: Double
    var catagoty: String

    init {
        this.price = price
        this.catagoty = catagoty
    }

    override fun displatInfo() {
        println("카테고리: ${catagoty}, 가격: ${price}, 이름: ${name}")
    }
}