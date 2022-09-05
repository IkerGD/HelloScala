import scala.collection.mutable.ListBuffer
import scala.io.Source

object LettFreq {
  def main(args: Array[String]): Unit = {

    val alph=scala.collection.mutable.Map(
      "A"->0.0f,"B"->0.0f,"C"->0.0f,"D"->0.0f,"E"->0.0f,"F"->0.0f,"G"->0.0f,
      "H"->0.0f,"I"->0.0f,"J"->0.0f,"K"->0.0f,"L"->0.0f,"M"->0.0f,"N"->0.0f,
      "O"->0.0f,"P"->0.0f,"Q"->0.0f,"R"->0.0f,"S"->0.0f,"T"->0.0f,
      "U"->0.0f,"V"->0.0f,"W"->0.0f,"X"->0.0f,"Y"->0.0f,"Z"->0.0f
    )


    def freq(url: String): Unit = {
      val file = Source.fromFile(url)
      val lines = file.getLines.toList
      file.close

      for (line <- lines) {
        val word=line.toUpperCase.split("").toList.distinct
        for (l <- word){
          if (l!="-") alph(l)=alph(l)+1
        }
      }

      val n = lines.length

      println("De 200,000 palabras, el porcentaje de las mismas donde \n aparece al menos una vez cada letra es el siguiente:")
      println("Letter \t Freq")
      for ((k,v) <- alph.map{case (k,v) => k -> 100 * v/n }){
        println(f"$k \t\t $v%.2f%%")
      }
      println(f"Adicionalmente, la letra menos frecuente es: ${alph.minBy(_._2)._1}")
    }

    freq("C:\\Users\\CONSULTOR\\Documents\\Scala\\IntelliJ\\HelloScala\\words.txt")
  }
}
