object SecToHMS {

  def main(args: Array[String]): Unit = {
    val ch = new NumCheck()
    val s = ch.posIntCheck()
    val dd = s/86400
    val hh = (s%86400)/3600
    val mm = (s%3600)/60
    val ss = s%60

    println(f"$s segundos es equivalente a $dd%02d:$hh%02d:$mm%02d:$ss%02d días, horas, minutos y segundos respectivamente")
  }
}

