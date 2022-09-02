import scala.math.pow

object AproxPi {
  def main(args:Array[String]):Unit = {

    def factorial(n: Int): Int = {
      if (n == 0) 1
      else n * factorial(n - 1)
    }

    def approx(n:Int):Double= {
      var ap=0.0
      for (i <- 2 to n + 2) {
         ap = ap + (pow(-1, i) / (factorial(i) / factorial(i - 2)))
      }
      ap
    }

    val ch = new NumCheck()
    val m = ch.posIntCheck()

    val p=3+4*approx(m)
    println("Aproximadamente, "+"\uD835\uDF0B" +" vale: " + p)
    }
  }
