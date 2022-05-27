val scala3Version = "3.1.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "reddit-comments",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "0.7.26" % Test
    )
  )
