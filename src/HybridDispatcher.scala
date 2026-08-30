class StreamSession(state: Int = 91) {
  def dispatch(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 91) % 997
    }
    count
  }
}

object App extends App {
  println(new StreamSession().dispatch(91))
}
