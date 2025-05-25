def main(args:Array[String])=
{
val age1=20;
val age="50";
age1 match {
case 20 => println(age1);
case 18 => println(age1);
case 30 => println(age1);
case 40 => println(age1);
case 50 => println(age1);
case _  => println("Default");
}
val result = age match {
case "20" => age;
case "18" => age;
case "30" => age;
case "40" => age;
case "50" => age;
case _  => println("Default");     }
println("result=" + result);
val i=7;
i match {
case 1 | 3 | 5 | 7 | 9 => println("odd");
case 2 | 4 | 6 | 8 | 10 => println("even");
}
} 

