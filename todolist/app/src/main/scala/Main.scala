import todolist.controller.GetTodoListByBoardIdController

import java.util.UUID

object Main {

  val controller = new GetTodoListByBoardIdController()

  def main(args: Array[String]): Unit = {
    println(controller.get(UUID.randomUUID()))
  }
}
