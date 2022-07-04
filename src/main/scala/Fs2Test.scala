
import fs2.text.utf8.decode

object Fs2Test extends App {
  fs2.Stream
    .emits("Hello".getBytes("UTF-8"))
    .through(decode)
    .compile
    .toList
    .foreach(println)
}
