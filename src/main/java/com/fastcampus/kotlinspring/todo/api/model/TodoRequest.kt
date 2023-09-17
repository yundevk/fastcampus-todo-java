package com.fastcampus.kotlinspring.todo.api.model

data class TodoRequest(
    var title: String,
    var description: String,
    var done: Boolean = false,
)