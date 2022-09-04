import scala.io.StdIn.readLine

object DistCh {
  def main(args:Array[String]) : Unit = {
    println("Ingrese una cadena de caracteres \n puede contener números, símbolos o espacios")
    val a = readLine().split("").groupBy(identity).size
    println(f"La entrada contiene $a carácteres únicos")
  }
}
