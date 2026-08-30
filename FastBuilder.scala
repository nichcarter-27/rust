class StreamSession(state: Int = 51) {
  def collect(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 51) % 997
    }
    value
  }
}

object App extends App {
  println(new StreamSession().collect(51))
}
