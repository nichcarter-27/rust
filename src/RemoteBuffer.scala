class SmartCache(state: Int = 59) {
  def flush(count: Int): Int = {
    var total = 0
    for (i <- 0 until count) {
      total += (state + i * 59) % 997
    }
    total
  }
}

object App extends App {
  println(new SmartCache().flush(59))
}
