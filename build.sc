import mill._
import mill.scalalib._

object Deps {
  val scalaVersion = "2.13.8"
}

object hello extends ScalaModule {
  override def scalaVersion = Deps.scalaVersion
  override def generatedSources = T {
    val hello = s"""
      |package hello
      |object Hello {
      |  def main(args: Array[String]): Unit = {
      |    println("Hello there!")
      |    println("Mill version: ${mill.BuildInfo.millVersion}")
      |  }
      |}
      """.stripMargin
    os.write(T.dest / "hello" / "hello.scala", hello, createFolders = true)
    Seq(PathRef(T.dest))
  }

  def ivyDeps = Agg(
    ivy"io.circe::circe-core:0.14.3",
    ivy"eu.timepit::refined:0.10.1",
    ivy"ch.epfl.scala:bsp4j:2.1.0-M4",
    ivy"io.circe::circe-generic:0.14.3"
  )
}
