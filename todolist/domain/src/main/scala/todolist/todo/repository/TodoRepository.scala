package todolist.todo.repository

import todolist.todo.board.BoardId
import todolist.todo.request.TodoRequest
import todolist.todo.todo.Todo

trait TodoRepository {
  def add(request: TodoRequest): Unit
  def getBy(boardId: BoardId): TodoList
}

case class TodoList(
    boardId: BoardId,
    todoList: Seq[Todo]
)
