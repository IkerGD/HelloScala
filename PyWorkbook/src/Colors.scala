object Colors {
  def main(args: Array[String]) : Unit = {
    val ch = new NumRanCheck(380, 750)
    val nm = ch.posCheck()
    var cl : String = ""

    if (nm < 450) {
      cl="violeta"
    }
    else if (450<=nm && nm<495){
      cl="azul"
    }
    else if (495 <= nm && nm < 570) {
      cl = "verde"
    }
    else if (570 <= nm && nm < 590) {
      cl = "amarillo"
    }
    else if (590 <= nm && nm < 620) {
      cl = "naranja"
    }
    else {cl = "rojo"}

    println(f"El color que se produce con una longitud de onda de $nm nm es $cl")
  }

}
