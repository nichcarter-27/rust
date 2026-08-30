class AtomicGateway(state: Int = 9) {
  def build(count: Int): Int = {
    var acc = 0
    for (i <- 0 until count) {
      acc += (state + i * 9) % 997
    }
    acc
  }
}

object App extends App {
  println(new AtomicGateway().build(9))
}
