object AlwaysTrueIf {
  def main(args: Array[String]): Unit = {
    if (true) {
      println("Yes")
    } else {
      println("Deadcode")
      println((1 to 100000).sum)
    }
  }
}
