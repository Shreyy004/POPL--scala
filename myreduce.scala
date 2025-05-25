object myreduce{
 val lst=List(1,2,3,5,7,10,13);
 val lst2=List("A","B","C");
 def main(args:Array[String])={
  println(lst.reduceLeft(_+_));
  println(lst.reduceLeft((x,y)=>{println(x+","+y);x+y;}))
  println(lst2.reduceLeft(_+_));
  println(lst.reduceRight(_+_));
  println(lst.reduceLeft(_-_));
  println(lst.reduceRight(_-_));
  println(lst.reduceLeft((x,y)=>{println(x+","+y);x+y;}))
  println(lst.reduceRight((x,y)=>{println(x+","+y);x-y;}))
  }
}