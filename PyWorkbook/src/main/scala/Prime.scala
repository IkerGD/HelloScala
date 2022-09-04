object Prime {
  def main(args: Array[String]): Unit = {
    val nc = new NumCheck()
    val n = nc.posIntCheck()

    def isPrime(n:Int):String = {
      if (n==1) "no "
      else {
        for (i <- 2 until n-1) {
          if (n % i == 0) return "no "
          else return ""
        }
        ""
      }
    }

    println(f"$n ${isPrime(n)}es primo")
  }
}
