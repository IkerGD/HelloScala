import scala.collection.mutable.ListBuffer
import scala.io.Source

object LettFreq {
  def main(args: Array[String]): Unit = {

    val alph=scala.collection.mutable.Map(
      "A"->0.0,"B"->0.0,"C"->0.0,"D"->0.0,"E"->0.0,"F"->0.0,"G"->0.0,
      "H"->0.0,"I"->0.0,"J"->0.0,"K"->0.0,"L"->0.0,"M"->0.0,"N"->0.0,
      "O"->0.0,"P"->0.0,"Q"->0.0,"R"->0.0,"S"->0.0,"T"->0.0,
      "U"->0.0,"V"->0.0,"W"->0.0,"X"->0.0,"Y"->0.0,"Z"->0.0
    )


    def freq(url: String): Unit = {
      val file = Source.fromFile(url)
      val lines = file.getLines.toList
      file.close

      val word = new ListBuffer[String]
      for (line <- lines) {
        for (c <-line.split("")) word += c
        val lett=word.distinct
        for (l <- alph.keys){
          if (lett.contains(l)){
            alph(l)=alph(l)+1
          }
        }
      }

      val n = lines.length
      alph.map{case (k,v) => k -> 100 * v.toFloat/n }


      println("Letter Freq")
      for ((k,v) <- alph){
        println(f"$k $v%2f")
      }
    }

    freq("/home/iker/Documents/Scala/HelloScala/words.txt")
  }
}
