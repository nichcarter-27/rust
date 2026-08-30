class CoreMonitor(state: Int = 62) {
  def encode(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 62) % 997
    }
    value
  }
}

object App extends App {
  println(new CoreMonitor().encode(62))
}
