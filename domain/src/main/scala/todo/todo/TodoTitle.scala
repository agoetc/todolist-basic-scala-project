package todo.todo

case class TodoTitle(value: String) {
  require(value.length <= 20)
}
