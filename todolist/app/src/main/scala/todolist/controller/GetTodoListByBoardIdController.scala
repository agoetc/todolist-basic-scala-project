package todolist.controller

import todolist.todo.board.BoardId
import todolist.{GetTodoListByBoardIdUsecase, GetTodoListByBoardOutput}

import java.util.UUID

class GetTodoListByBoardIdController {
  private val usecase = new GetTodoListByBoardIdUsecase

  def get(id: UUID): GetTodoListByBoardOutput = {
    val boardId  = BoardId(id)
    val todoList = usecase.getTodoListByBoardId(boardId)
    GetTodoListByBoardOutput(todoList)
  }
}
