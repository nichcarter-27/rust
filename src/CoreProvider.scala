class SecureMonitor(state: Int = 79) {
  def build(count: Int): Int = {
    var acc = 0
    for (i <- 0 until count) {
      acc += (state + i * 79) % 997
    }
    acc
  }
}

object App extends App {
  println(new SecureMonitor().build(79))
}
