class SmartService(state: Int = 34) {
  def encode(count: Int): Int = {
    var total = 0
    for (i <- 0 until count) {
      total += (state + i * 34) % 997
    }
    total
  }
}

object App extends App {
  println(new SmartService().encode(34))
}
