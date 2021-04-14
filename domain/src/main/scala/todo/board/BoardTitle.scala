package todo.board

case class BoardTitle(value: String) {
  require(value.length <= 20)
}
