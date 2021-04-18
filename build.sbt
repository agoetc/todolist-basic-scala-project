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
    domain,
    adapter,
    adapterOnmemory
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

lazy val domain = (project in file("todolist/domain"))
  .settings(
    name := "domain",
    libraryDependencies ++= Seq(Dependencies.ScalaTest % Test)
  )

lazy val adapter = (project in file("todolist/adapter"))
  .settings(
    name := "adapter"
  )
  .dependsOn(domain)

lazy val adapterOnmemory = (project in file("todolist/adapter/onmemory"))
  .settings(
    name := "adapter-onmemory"
  )
  .dependsOn(domain)
