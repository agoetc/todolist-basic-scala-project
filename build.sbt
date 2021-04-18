name := "todolist"
version := "0.1"
scalaVersion := "2.13.5"

lazy val root = (project in file("."))
  .settings(
    name := "todolist"
  )
  .aggregate(
    app,
    usecase,
    service,
    domain
  )

lazy val app = (project in file("todolist/app"))
  .settings(
    name := "app"
  )
  .dependsOn(domain, usecase)

lazy val usecase = (project in file("todolist/usecase"))
  .settings(
    name := "usecase"
  )
  .dependsOn(domain)

lazy val service = (project in file("todolist/service"))
  .settings(
    name := "service"
  )
  .dependsOn(domain)

lazy val domain = (project in file("todolist/domain"))
  .settings(
    name := "domain",
    libraryDependencies ++= Seq(Dependencies.ScalaTest % Test)
  )
