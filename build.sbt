lazy val root = project
  .in(file("."))
  .settings(
    name := "reddit-comments",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.13.8",
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "0.7.26" % Test,
      ("org.apache.spark" %% "spark-sql" % "3.2.0" % "provided")
        .cross(CrossVersion.for3Use2_13), // allows us to use Spark with Scala3
      ("org.apache.spark" %% "spark-core" % "3.2.0" % "provided")
        .cross(CrossVersion.for3Use2_13) // allows us to use Spark with Scala3
    )
  )
