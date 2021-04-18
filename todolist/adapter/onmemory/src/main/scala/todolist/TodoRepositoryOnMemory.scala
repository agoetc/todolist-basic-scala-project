package todolist

import todolist.todo.board.BoardId
import todolist.todo.repository.{TodoList, TodoRepository}
import todolist.todo.request.TodoRequest
import todolist.todo.todo._

class TodoRepositoryOnMemory extends TodoRepository {
  def add(request: TodoRequest): Unit = ()

  def getBy(boardId: BoardId): TodoList =
    TodoList(
      UUIDCreator.create(BoardId),
      Seq(
        Todo(
          id = UUIDCreator.create(TodoId),
          title = TodoTitle("aaa"),
          content = TodoContent("content"),
          status = TodoStatus.Done
        )
      )
    )
}
