object BinaryConstantFoldVal {
  def main(args: Array[String]): Unit = {
    val x = 1 + 10
    if (x == 11) {
      println("Yes")
    } else {
      println("Deadcode")
      println((1 to 100000).sum)
    }
  }
}
