object ListPatternMatching {
  def length[a](list: List[a], l: Int = 0): Int = {
  list match {
    case head :: tail => length(tail, l + 1)
    case Nil => l}
  }
  def max(list: List[Int]): Option[Int] = list match {
  case Nil => None
  case List(head: Int) => Some(head)
  case head :: tail :: rest => max( (if (head > tail) head else tail) :: rest )
  }
  def min(list: List[Int]): Option[Int] = list match {
  case Nil => None
  case List(head: Int) => Some(head)
  case head :: tail :: rest => min( (if (head < tail) head else tail) :: rest )
  }
  def lastNthRecursive[A](n: Int, ls: List[A]): A = {
      def lastNthR(count: Int, resultList: List[A], curList: List[A]): A =curList match {
          case Nil if count > 0 => throw new NoSuchElementException
          case Nil              => resultList.head
          case _ :: tail        =>
          lastNthR(count - 1,if (count > 0) resultList else resultList.tail,tail)
          }
      if (n <= 0) throw new IllegalArgumentException else lastNthR(n, ls, ls)
      }
  def main(args:Array[String]){
    println(length(List(1,2)))
    println(max(List(1,2,7,15,5)))
    println(min(List(1,2,7,15,5)))
    println(lastNthRecursive(2,List(4,5,6,7)))
  }
}