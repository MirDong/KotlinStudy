package com.dzk.example.chapter3

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    // 声明一个局部函数来验证所有字段
    fun validate(user: User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty $fieldName"
            )
        }
    }
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
    // 保存到数据库
}

fun main() {
    val user = User(1, "", "")
    saveUser(user)
}