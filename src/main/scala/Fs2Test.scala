
import fs2.text.utf8.decode
import fs2.text.utf8.encode

object Fs2Test extends App {
  fs2.Stream
    .emits(List("Hello", "World"))
    .through(encode)
    .through(decode)
    .compile
    .toList
    .foreach(println)
}
