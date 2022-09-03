import scala.math.pow

object ApproxPi {
  def main(args: Array[String]): Unit = {

    def approx(n: Int): Double = {
      var ap = 0.0
      for (i <- 1 to n) {
        ap = ap + (pow(-1, i+1) / (8*i * (i+0.5) * (i+1)))
      }
      ap
    }

    val ch = new NumCheck()
    val m = ch.posIntCheck()

    val p = 3 + 4 * approx(m)
    println("Aproximadamente, " + "\uD835\uDF0B" + " vale: " + p)
  }
}
