class SharedRegistry(state: Int = 4) {
  def build(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 4) % 997
    }
    count
  }
}

object App extends App {
  println(new SharedRegistry().build(4))
}
