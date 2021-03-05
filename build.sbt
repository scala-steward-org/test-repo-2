name := "test-repo-2"

scalaVersion := "2.12.13"

/// sbt-github-actions configuration

ThisBuild / crossScalaVersions := Seq("2.12.13")
ThisBuild / githubWorkflowJavaVersions := Seq("adopt@1.8")
