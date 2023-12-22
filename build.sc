import mill._
import mill.scalalib._

object Deps {
  val scalaVersion = "2.13.12"
}

object hello extends ScalaModule {
  override def scalaVersion = Deps.scalaVersion
  override def generatedSources = T {
    val hello = s"""
      |package hello
      |object Hello {
      |  def main(args: Array[String]): Unit = {
      |    println("Hello there!")
      |    println("Mill version:")
      |  }
      |}
      """.stripMargin
    os.write(T.dest / "hello" / "hello.scala", hello, createFolders = true)
    Seq(PathRef(T.dest))
  }

  def ivyDeps = Agg(
    ivy"io.circe::circe-core:0.14.6",
    ivy"eu.timepit::refined:0.10.3", // huh
    ivy"ch.epfl.scala:bsp4j:2.1.0-M5",
    ivy"io.circe::circe-generic:0.14.6",
    ivy"javax.jms:javax.jms-api:2.0.1",
    ivy"activemq:activemq:4.0-M3",
    ivy"io.circe::circe-fs2:0.14.1",
    ivy"io.circe::circe-config:0.10.1"
  )
}
