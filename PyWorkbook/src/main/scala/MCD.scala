object MCD {
  def main(args:Array[String]): Unit = {
    val ch = new NumCheck()
    val n = ch.posIntCheck()
    val m = ch.nextPosIntCheck()

    def bigg(n: Int, m: Int): (Int, Int) = {
      if (n > m) {
        val b = n
        val s = m
        (b, s)
      }
      else {
        val b = m
        val s = n
        (b, s)
      }
    }

    def mcd(n: Int, m: Int): Int = {
      val r1 = bigg(n, m)._1
      val r2 = bigg(n, m)._2
      var r3 = r2
      while (r1%r3!=0 || r2%r3!=0) {r3=r3-1}
      r3
    }

    println(f"EL máximo común divisor de $n y $m es ${mcd(n, m)}")

  }




}


