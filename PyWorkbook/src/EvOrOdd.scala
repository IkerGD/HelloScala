object EvOrOdd {
  def main(args: Array[String]): Unit = {
    val ch = new NumCheck()
    val n =ch.posIntCheck()

    if ((n%2)!=1) println(f"$n es un número par")  else println(f"$n es un número impar")

  }
}
