import scala.io.StdIn.{readFloat, readInt}
import scala.util.{Failure, Success, Try}


class NumCheck {

  def intInp(): Int = {
    Try(readInt())
    match {
      case Success(s) =>
        s
      case Failure(_) =>
        println("No ingresó un valor apropiado, intente de nuevo")
        intInp()
    }
  }

  def floatInp(): Float = {
    Try(readFloat())
    match {
      case Success(s) =>
        s
      case Failure(_) =>
        println("No ingresó un valor apropiado, intente de nuevo")
        floatInp()
    }
  }

  def zPosInt(m: Int): Int = if (m < 0) {
    println("No ingresó un número positivo, intente de nuevo")
    zPosInt(intInp())
  } else m

  def zPos(m: Float): Float = if (m < 0) {
    println("No ingresó un número positivo, intente de nuevo")
    zPos(intInp())
  } else m


  def posIntCheck() : Int = {
    println("Ingrese un número entero positivo")
    zPosInt(intInp())
  }

  def posCheck(): Float = {
    println ("Ingrese un número positivo")
    zPos(floatInp())
  }
}
