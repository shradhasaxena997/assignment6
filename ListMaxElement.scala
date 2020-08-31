object ListMaxElement {
  val list:List[Int]=List(15,9,18,27,0,36,45,78,5,7,8,10,17)
  def main(args:Array[String]){
   println(list.sorted.take(5))
   for(i<-list){if(i>9 && i<18){println(i*5)}}
   }
}