name := "test-repo-2"

scalaVersion := "2.13.7"

/// sbt-github-actions configuration

ThisBuild / crossScalaVersions := Seq("2.13.7")
ThisBuild / githubWorkflowJavaVersions := Seq("adopt@1.8")

libraryDependencies += "com.github.japgolly.scalajs-react" % "core_sjs1_2.13" % "2.0.0-RC5"
