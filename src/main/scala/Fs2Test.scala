import fs2.text.{utf8Decode, utf8Encode}

object Fs2Test extends App {
  fs2.Stream
    .emits(List("Hello", "World"))
    .through(utf8Encode)
    .through(utf8Decode)
    .compile
    .toList
    .foreach(println)
}
