package com.fastcampus.kotlinspring.todo.api.model

import com.fastcampus.kotlinspring.todo.domain.Todo

data class TodoListResponse(
    val items: List<TodoResponse>,
) {
    val size: Int
        get() = items.size

    fun get(index: Int) = items[index]

    companion object {
        fun of (todoList: List<Todo>) =
            TodoListResponse(todoList.map(TodoResponse::of))
    }
}