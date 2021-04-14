package todo.todo

case class Todo(
    id: TodoId,
    title: TodoTitle,
    content: TodoContent,
    status: TodoStatus
)
