name := "test-repo-2"

scalaVersion := "2.13.8"

/// sbt-github-actions configuration

ThisBuild / crossScalaVersions := Seq("2.13.8")

libraryDependencies += "co.fs2" %% "fs2-core" % "3.2.4"
