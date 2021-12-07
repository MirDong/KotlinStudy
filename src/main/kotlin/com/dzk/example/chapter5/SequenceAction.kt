package com.dzk.example.chapter5

fun main() {
    val res = listOf<Int>(1, 2, 3, 4).asSequence().map {
        println("map $it")
        it * it
    }.filter {
        println("filter $it")
        it % 2 == 0
    }.toList()
    println("end with $res")
}