object higher1
{
 def math(x:Double,y:Double,fn:(Double,Double)=>Double):Double=fn(x,y);
 def main(args:Array[String])={
  val result=math(50,20,(x,y)=>x max y);
  println(result);
  }
}