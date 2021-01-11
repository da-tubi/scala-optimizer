object ShortCircuitFoldVal {
  def main(args: Array[String]): Unit = {
    val x = 1000
    val y = 1024
    val T = true
    val F = false
    val x1 = if (T) x else (1 to 100000).sum
    val y1 = if (F) (1 to 100000).sum else y
    println(x)
    println(y)
    println(x1)
    println(y1)
  }
}
