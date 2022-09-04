import scala.collection.immutable.ListMap
import scala.collection.mutable.ListBuffer
import scala.util.Random

object TwoDice {
  def main(args:Array[String]) : Unit = {
    val r = new Random

    def ocurr[A](list: ListBuffer[A]): Map[A, Int] = {
      list.groupBy(el => el).map(e => (e._1, e._2.length))
    }

    def sim(n:Int): Map[Int, Int] = {
        val lan = new ListBuffer[Int]
        for (_ <- 1 to n) {
          lan += (r.nextInt(6) + 1) + (r.nextInt(6) + 1)
        }
        ListMap(ocurr(lan).toSeq.sortBy(_._1):_*)
    }

    def freq(n:Int): Iterable[Float]= {
      sim(n).map{case (k,v) => k -> 100 * v.toFloat/n }.values
    }

    var j = 1
    val probs = List(1.0f,2.0f,3.0f,4.0f,5.0f,6.0f,5.0f,4.0f,3.0f,2.0f,1.0f)
    println(f"Suma \t Freq \t Proba")

    for (i <- freq(1000)) {
      val p=f"${100*(probs(j-1) /36)}%.2f"
      println(f" ${j+1}%2d \t $i \t $p")
      j=j+1

    }
  }
}
