import mill._
import mill.scalalib._

object Deps {
  val scalaVersion = "2.13.1"
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
    ivy"eu.timepit::refined:0.10.1"
  )
}
