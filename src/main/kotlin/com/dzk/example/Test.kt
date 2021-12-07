package com.dzk.example

fun main() {
    println(Colors.valueOf("RED").color)
    val obj = Colors.GREEN
    println(obj == Colors.GREEN)
    println("inRange in = ${1 in 1..5}")
    println( "-123".hashCode())
    val hashAbs = ("-123".hashCode()) and Int.MAX_VALUE
    println("inRange in = $hashAbs")
}