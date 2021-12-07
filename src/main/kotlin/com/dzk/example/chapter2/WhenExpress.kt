package com.dzk.example.chapter2

import java.lang.Exception

fun getColorName(color: Color): String =
    when (color) {
        Color.BLUE -> "blue"
        Color.GREEN -> "green"
        Color.ORANGE -> "orange"
        Color.RED -> "red"
        Color.YELLOW -> "yellow"
        else -> ""
    }

fun getColorType(color: Color): String =
    when (color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
        Color.GREEN -> "neutral"
        Color.BLUE -> "cold"
        else -> ""
    }

fun main() {
    println(getColorName(Color.ORANGE))
    println(getColorType(Color.RED))
    println(getColorType(Color.ORANGE))
}

fun mix(c1: Color, c2: Color) {
    // when表达式的实参可以时任何对象，它被检查是否与分支条件相等
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("Dirty color")
    }
}

fun mixOptimized(c1: Color, c2: Color) {
    // when表达式可以没有实参
    when {
        (c1 == Color.RED && c2 == Color.YELLOW) || (c1 == Color.YELLOW && c2 == Color.RED) -> Color.ORANGE
        (c1 == Color.YELLOW && c2 == Color.BLUE) || (c1 == Color.BLUE && c2 == Color.YELLOW) -> Color.GREEN
        (c1 == Color.BLUE && c2 == Color.VIOLET) || (c1 == Color.VIOLET && c2 == Color.BLUE) -> Color.INDIGO
        else -> throw Exception("Dirty color")
    }
}

fun smartConvert(e: Expr) {
    // 无需使用as进行转换，在is进行类型检查时就进行了自动转换
    if (e is Sum) {
        val result = e.left + e.right
    }
}

fun expressWithIf(e: Expr): Int =
    if (e is Num ){
        e.value
    } else if (e is Sum) {
        e.left + e.right
    } else {
        throw Exception("unknow express")
    }


fun whenReplaceIf(e: Expr) =
    when(e) {
        is Num -> e.value
        is Sum -> e.left + e.right
        else -> throw Exception("unknow express")
    }


interface Expr

class Num(val value: Int): Expr

class Sum(val left: Int, val right: Int): Expr