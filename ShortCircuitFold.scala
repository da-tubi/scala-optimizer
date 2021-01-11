object ShortCircuitFold {
  def main(args: Array[String]): Unit = {
    val x = ((1 to 100).sum == 5050)
    val y = ((1 to 100).sum == 5051)
    val c1 = true || x == true
    val c2 = false && y == false
    val c3 = true && x == x
    val c4 = false || y == y
    val c5 = x && true == x
    val c6 = y || false == y
    println(c1)
    println(c2)
    println(c3)
    println(c4)
    println(c5)
    println(c6)
  }
}
