name := "test-repo-2"

scalaVersion := "2.13.7"

/// sbt-github-actions configuration

ThisBuild / crossScalaVersions := Seq("2.13.7")
ThisBuild / githubWorkflowJavaVersions := Seq("adopt@1.8")

libraryDependencies += "co.fs2" %% "fs2-core" % "3.2.2"
