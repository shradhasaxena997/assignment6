
object ListOfTable {
  val list:List[Int]=List(1,2,3,4,5,6,7,8,9,10)
  def hi(number:Int){
    for(i<-1 to list.size)
    {
      println(i*number)
    }
  }
  def main(args:Array[String]){
    println("Enter the number whose table you want to print")
  val number=scala.io.StdIn.readInt()
 // println(list.map(_*number))
  println(hi(number))
  }
}