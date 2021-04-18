package todolist.todo.board

import todolist.auth.User

case class Board(
    id: BoardId,
    owner: User,
    title: BoardTitle
)
