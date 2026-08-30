class HybridProcessor(state: Int = 77) {
  def resolve(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 77) % 997
    }
    value
  }
}

object App extends App {
  println(new HybridProcessor().resolve(77))
}
