object ShortCircuitFold {
  def main(args: Array[String]): Unit = {
    val x = 1000
    val y = 1024
    val x1 = if (true) x else (1 to 100000).sum
    val y1 = if (false) (1 to 100000).sum else y
    println(x)
    println(y)
    println(x1)
    println(y1)
  }
}
