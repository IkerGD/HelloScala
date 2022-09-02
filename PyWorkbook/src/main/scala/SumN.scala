object SumN {
  def main(args: Array[String]): Unit = {

    val ch = new NumCheck()
    val n = ch.posIntCheck()
    val sum = n * (n + 1) * 0.5
    println(f"La suma de los naturales del 1 al $n es $sum")

  }

}
