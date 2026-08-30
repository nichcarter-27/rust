class SimpleHandler(state: Int = 53) {
  def collect(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 53) % 997
    }
    result
  }
}

object App extends App {
  println(new SimpleHandler().collect(53))
}
