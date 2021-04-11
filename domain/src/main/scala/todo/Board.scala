package todo

import auth.User

case class Board(
    id: BoardId,
    owner: User,
    title: String // TODO
)
