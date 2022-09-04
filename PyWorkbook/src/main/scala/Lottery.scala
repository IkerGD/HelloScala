import scala.collection.mutable.ListBuffer
import scala.util.Random

object Lottery {
  def main(args:Array[String]) : Unit = {
    val r = new Random
    val wn = new ListBuffer[Int]

    def lott() : Unit = {
      while (wn.length != 6) {
        val t = r.nextInt(49) + 1
        if (wn.contains(t)) lott()
        else wn += t
      }
    }

    lott()
    print(f"Los números ganadores de la lotería son: ${wn.sorted mkString ", "}")

  }
}
