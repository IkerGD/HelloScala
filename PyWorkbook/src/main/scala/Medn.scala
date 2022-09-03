object Medn {
  def main(args:Array[String]): Unit = {
    val nc = new NumCheck()

    val n1=nc.posIntCheck()
    val n2=nc.nextPosIntCheck()
    val n3=nc.nextPosIntCheck()

    val list=List[Int](n1,n2,n3)
    val slist=list.sorted

    println(f"La mediana es ${slist(1)}")

  }
}
