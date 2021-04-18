package todolist.todo.request

import todolist.todo.board.BoardId
import todolist.todo.todo.{TodoContent, TodoStatus, TodoTitle}

case class TodoRequest(
    boardId: BoardId,
    title: TodoTitle,
    todoContent: TodoContent,
    status: TodoStatus
)
