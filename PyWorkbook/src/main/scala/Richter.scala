object Richter {
  def main(args: Array[String]): Unit = {
    val rt = new NumCheck()
    var sc = rt.posCheck()

    val mag = Map(
      1.0f -> "micro",
      2.0f -> "muy menor",
      3.0f -> "menor",
      4.0f -> "ligero",
      5.0f -> "moderado",
      6.0f -> "fuerte",
      7.0f -> "mayor",
      8.0f -> "cataclísmico",
      9.0f -> "cataclísmico",
      10.0f -> "apocalíptico")

    if (sc < 2.0) {
      sc = 1.0f
    }
    else if (11.0 <= sc) {
      sc = 10.0f
    }

    val cat = mag(sc.round)
    println(f"Un temblor de magnitud $sc es $cat de acuerdo a la escala Richter")

  }
}
