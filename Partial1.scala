object Partial1{
 def main(args:Array[String])={
   val sum = (a: Int, b: Int, c: Int) => a + b + c
   val f = sum(10,_:Int,30)
   println(f(20));
 }
} 
