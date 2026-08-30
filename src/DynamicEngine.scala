class SmartManager(state: Int = 81) {
  def render(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 81) % 997
    }
    result
  }
}

object App extends App {
  println(new SmartManager().render(81))
}
