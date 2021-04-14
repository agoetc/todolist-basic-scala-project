package todo.board

import auth.User

case class Board(
    id: BoardId,
    owner: User,
    title: BoardTitle
)
