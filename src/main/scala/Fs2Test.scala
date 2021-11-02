import fs2.text.utf8Decode

object Fs2Test extends App {
  fs2.Stream
    .emits("Hello".getBytes("UTF-8"))
    .through(utf8Decode)
    .compile
    .toList
    .foreach(println)
}
