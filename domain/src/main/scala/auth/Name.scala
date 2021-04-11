package auth

case class Name(firstName: String, lastName: String) {
  def fullName: String = firstName + " " + lastName
}
