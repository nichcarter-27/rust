class RemoteLoader(state: Int = 45) {
  def compute(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 45) % 997
    }
    result
  }
}

object App extends App {
  println(new RemoteLoader().compute(45))
}
