package com.dzk.example.chapter2

// 迭代区间
fun fizzBuzz(i: Int) = when {
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    i % 15 ==0 -> "FizzBuzz"
    else -> "$i"
}

fun main() {
    for (i in 1..100) {
        println(fizzBuzz(i))
    }
}