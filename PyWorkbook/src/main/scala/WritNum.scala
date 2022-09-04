import java.io.{BufferedWriter, File, FileWriter}
import scala.collection.mutable.ListBuffer
import scala.io.Source

object WritNum {
  def main(args:Array[String]) : Unit = {

    def writeFile(filename: String, lines: List[String]): Unit = {
      val file = new File(filename)
      val bw = new BufferedWriter(new FileWriter(file))
      for (line <- lines) {
        bw.write(line)
      }
      bw.close()
    }

    def indexLn(url:String,filename:String): Unit = {
      val file = Source.fromFile(url)
      val lines = file.getLines.toList
      file.close

      var i = 1
      val inLines = new ListBuffer[String]
      for (line <- lines){
        inLines += f"$i, $line\n"
        i=i+1
      }
      writeFile(filename, inLines.toList)
    }

    indexLn("/home/iker/Documents/Scala/HelloScala/words.txt", "words_indexed.txt")

  }
}
