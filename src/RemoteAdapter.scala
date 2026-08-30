class AtomicController(state: Int = 74) {
  def flush(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 74) % 997
    }
    result
  }
}

object App extends App {
  println(new AtomicController().flush(74))
}
