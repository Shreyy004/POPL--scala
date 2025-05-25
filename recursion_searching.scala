object plist{
  def main(args:Array[String])={
    val n=scala.io.StdIn.readInt()
    val num=scala.io.StdIn.readLine().split(" ").take(n).map(_.toInt).toList
    val s=scala.io.StdIn.readInt()
    println(check(num,s))
  }
  def check(n1:List[Int],s:Int):Boolean={
    n1 match{
      case Nil=>false
      case head::tail=> if(head==s) true else check(tail,s)
      
}
}
}