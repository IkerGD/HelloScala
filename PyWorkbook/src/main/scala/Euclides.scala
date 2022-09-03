object Euclides {
  def main(arg:Array[String]): Unit = {

    val ch = new NumCheck()
    val n = ch.posIntCheck()
    val m = ch.nextPosIntCheck()

    def bigg(n:Int, m:Int): (Int, Int) = {
      if (n > m) {
        val r1 = n
        val r2 = m
        (r1, r2)
      }
      else {
        val r1 = m
        val r2 = n
        (r1, r2)
      }
    }

    def MCD(n:Int, m:Int): Int = {
      var r1 = bigg(n,m)._1
      var r2 = bigg(n, m)._2
      var r3 = 1
      while (r3 != 0) {
         r3=r1 % r2
         r1=r2
         r2=r3
      }
      r1
    }

    val mcd = MCD(n,m)
    println(f"EL máximo común divisor de $n y $m es $mcd")

  }
}

