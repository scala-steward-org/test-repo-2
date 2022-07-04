name := "test-repo-2"

scalaVersion := "2.13.8"

licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

/// sbt-github-actions configuration

ThisBuild / crossScalaVersions := Seq("2.13.8")

libraryDependencies += "co.fs2" %% "fs2-core" % "3.2.9"
