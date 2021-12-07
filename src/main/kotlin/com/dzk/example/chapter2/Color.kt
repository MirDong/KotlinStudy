package com.dzk.example.chapter2

/**
 * 枚举类
 */
enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255,0,0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238); // 必须要有分号

    fun rgb(): Int = (r * 256 + g) * 256 + b
}

fun main() {
    println(Color.BLUE.rgb())
}