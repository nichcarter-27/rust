class StreamController(state: Int = 40) {
  def dispatch(count: Int): Int = {
    var total = 0
    for (i <- 0 until count) {
      total += (state + i * 40) % 997
    }
    total
  }
}

object App extends App {
  println(new StreamController().dispatch(40))
}
