import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine

object LengthEnc {
  def main(args:Array[String]): Unit = {
    println("Ingrese una cadena de caracteres")
    val str = readLine()

    def redRep(list: List[String]):ListBuffer[String] = {
      val redList = new ListBuffer[String]
      for (l <-1 to list.length) {
        if (l<list.length) {
          if (list(l-1)!=list(l)) redList += list(l-1)
        }
        else redList += list(l-1)
      }
      redList
    }

    def enc(string: String): ListBuffer[String] = {
      val list = string.split("").toList
      val listBuffer = new ListBuffer[String]
      val rList =redRep(list)
      val dList=ListBuffer.empty ++= list
      for (l <- rList) {
        var t = 0
        for (_ <- 1 to dList.length)
          if (l == dList.head) {
            t = t + 1
            dList -= dList.head
          }
        listBuffer += l += t.toString
      }
      listBuffer
    }
    println(enc(str))
  }
}
