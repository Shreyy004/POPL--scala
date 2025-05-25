object myfoldscan
{
 val lst=List(1,2,3,5,7,10,13);
 val lst2=List("A","B","C");
 def main(args:Array[String])={
  println(lst.foldLeft(0)(_+_));
  println(lst.foldLeft(100)(_+_));
  println(lst.foldLeft("z")(_+_));
  println(lst.foldLeft(100)(_+_));
  println(lst.foldLeft("z")(_+_));

 }
}