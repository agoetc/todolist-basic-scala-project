package todo.todo

sealed trait TodoStatus

object Todo  extends TodoStatus
object Doing extends TodoStatus
object Done  extends TodoStatus
