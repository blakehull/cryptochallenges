name := "Cryptography"

val circeVersion = "0.12.3"

version := "0.1"

scalaVersion := "2.13.2"

libraryDependencies += "commons-codec" % "commons-codec" % "1.14"
libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.10"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)


