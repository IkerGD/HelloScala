import scala.math.Pi

object CirSphere {
  def main(args: Array[String]): Unit = {
    val ch = new NumCheck()
    val r = ch.posIntCheck()
    val rad = Pi * r * r
    val vol = 4 / 3 * Pi * r * r * r
    println(f"El área de un círculo de radio $r es: $rad%f")
    println(f"El volumen de una esfera de radio $r es: $vol%f")
  }
}
