name := "test-repo-2"

scalaVersion := "2.13.10"

headerLicense := Some(
  HeaderLicense.ALv2("2018-2022", "Scala Steward contributors")
)

/// sbt-github-actions configuration

ThisBuild / crossScalaVersions := Seq("2.13.10")

libraryDependencies += "co.fs2" %% "fs2-core" % "3.5.0"
