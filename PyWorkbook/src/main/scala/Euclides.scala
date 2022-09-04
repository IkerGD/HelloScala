object Euclides {
  def main(arg:Array[String]): Unit = {

    val ch = new NumCheck()
    val n = ch.posIntCheck()
    val m = ch.nextPosIntCheck()

    def bigg(n:Int, m:Int): (Int, Int) = {
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

    def Euc(n:Int, m:Int): Int = {
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

    val mcd = Euc(n,m)
    println(f"EL máximo común divisor de $n y $m es $mcd")

  }
}

