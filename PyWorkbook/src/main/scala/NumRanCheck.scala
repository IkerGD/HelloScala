import scala.annotation.tailrec

class NumRanCheck(low:Float, high:Float) extends NumCheck {

  @tailrec
  private def ranCheck(n:Float): Float = if (n<low) {
    println(f"El número ingresado es menor que $low, intente de nuevo")
    ranCheck(zPos(floatInp()))
  }
  else if (n>high) {
    println(f"El número ingresado es mayor a $high, intente de nuevo")
    ranCheck(zPos(floatInp()))
  }
  else n


  override def posCheck(): Float = {
    println(f"Ingrese un número entre $low y $high")
    ranCheck(zPos(floatInp()))
  }


}
