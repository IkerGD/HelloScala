import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine

object LengthEnc {
  def main(args:Array[String]): Unit = {
    println("Ingrese una cadena de caracteres")
    val ch = readLine().split("").toList
    val lb = new ListBuffer[String]

    for (l <- ch) {
      var t = 0
      for (p <-1 to ch.length ) {
        while (l == ch(p-1)) t=t+1
        lb += l += t.toString
      }
    }
    println(lb mkString ",")

  }
}
