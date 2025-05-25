object cmdcheck{
def main(args:Array[String])={
check(5);
}
def check(args:Int):Unit={
var i=1;
while(i<=args){
println(i)
i+=1
}
}
}