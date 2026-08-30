class BatchAdapter(state: Int = 55) {
  def sync(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 55) % 997
    }
    value
  }
}

object App extends App {
  println(new BatchAdapter().sync(55))
}
