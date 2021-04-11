package todo

sealed trait Status

object Todo  extends Status
object Doing extends Status
object Done  extends Status
