package todolist

import todolist.todo.board.BoardId

import java.util.UUID

class GetTodoListByBoardIdController {
  private val usecase = new GetTodoListByBoardIdUsecase

  def get(id: UUID): GetTodoListByBoardOutput = {
    val boardId  = BoardId(id)
    val todoList = usecase.getTodoListByBoardId(boardId)
    GetTodoListByBoardOutput(todoList)
  }
}
