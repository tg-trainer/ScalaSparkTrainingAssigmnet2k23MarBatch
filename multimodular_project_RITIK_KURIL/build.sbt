lazy val root = (project in file("."))
  .aggregate(module1, module2)

lazy val module1 = (project in file("module1"))
  .settings(
    name := "module1"
  )

lazy val module2 = (project in file("module2"))
  .dependsOn(module1)
  .settings(
    name := "module2"
  )