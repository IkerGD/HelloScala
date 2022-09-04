import scala.collection.mutable.ListBuffer

object Factors {
  def main(arg: Array[String]): Unit = {
    val nc = new NumCheck()
    val n = nc.posIntCheck()

    val f = new ListBuffer[Int]

    def fact(n: Int): Unit = {
      for (i <- 1 until n - 1) {
        if (n % i == 0) {
          f += i
        }
          : Unit
      }
    }
    fact(n)
    println(f"Los factores de $n son: ${f mkString ", "}")
  }
}
