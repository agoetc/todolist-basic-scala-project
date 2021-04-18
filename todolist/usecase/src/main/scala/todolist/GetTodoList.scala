package todolist

import todolist.todo.board.BoardId
import todolist.todo.repository.TodoList

class GetTodoListByBoardIdUsecase {

  private val repository = new TodoRepositoryOnMemory

  def getTodoListByBoardId(boardId: BoardId): TodoList = repository.getBy(boardId)
}

case class GetTodoListByBoardInput(boardId: BoardId)
case class GetTodoListByBoardOutput(todoList: TodoList)
