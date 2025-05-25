object curry
{
 def add(x:Int,y:Int) = x + y
 def add2(x:Int) = (y:Int) => x + y; //curried version
 def add3(x:Int)(y:Int) = x + y;//Simpler scala version
 def main(args:Array[String])={
  println(add(20,10));
  println(add2(20)(10));//calling  curried add2
  val sum40 = add2(40);
  println(sum40(100));//Partial application 
  println(add3(100)(200));//calling simpler scala version
  val sum50 = add3(50);//partial application of simple version
  println(sum50(400));
 }
} 
