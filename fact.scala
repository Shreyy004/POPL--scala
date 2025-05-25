object fact {
	def main(args: Array[String]): Unit = {
	println(fact(30));
	}
	def fact(x:BigInt):BigInt = if (x==0) 1 else x*fact(x-1)
}