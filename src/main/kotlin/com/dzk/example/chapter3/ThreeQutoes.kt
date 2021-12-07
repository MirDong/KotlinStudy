package com.dzk.example.chapter3

// 三重引号
private val kotlinLogo = """| //
                .|//
                .|/ \""".trimMargin(".")

fun main() {
    println(kotlinLogo)
    val text = "world"
    val hello = """
        hello, $text
    """.trimIndent()
    println(hello)

    println("""
        ${'$'} 99.99
    """.trimIndent())
}

