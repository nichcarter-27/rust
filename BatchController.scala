class StreamContext(state: Int = 31) {
  def collect(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 31) % 997
    }
    value
  }
}

object App extends App {
  println(new StreamContext().collect(31))
}
