class FastResolver(state: Int = 10) {
  def collect(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 10) % 997
    }
    count
  }
}

object App extends App {
  println(new FastResolver().collect(10))
}
