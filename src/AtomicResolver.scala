class SharedProcessor(state: Int = 38) {
  def handle(count: Int): Int = {
    var total = 0
    for (i <- 0 until count) {
      total += (state + i * 38) % 997
    }
    total
  }
}

object App extends App {
  println(new SharedProcessor().handle(38))
}
