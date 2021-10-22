name := "test-repo-2"

scalaVersion := "2.13.6"

/// sbt-github-actions configuration

crossScalaVersions.in(ThisBuild) := Seq("2.13.6")
githubWorkflowJavaVersions.in(ThisBuild) := Seq("adopt@1.8")
