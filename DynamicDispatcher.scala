class RemoteResolver(state: Int = 17) {
  def parse(count: Int): Int = {
    var acc = 0
    for (i <- 0 until count) {
      acc += (state + i * 17) % 997
    }
    acc
  }
}

object App extends App {
  println(new RemoteResolver().parse(17))
}
