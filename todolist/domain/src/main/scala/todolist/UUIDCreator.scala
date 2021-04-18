package todolist

import java.util.UUID

object UUIDCreator {
  def create[IdT <: Id](f: UUID => IdT): IdT =
    f(UUID.randomUUID())
}
