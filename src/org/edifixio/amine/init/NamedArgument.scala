package org.edifixio.amine.init

object NamedArgument {
  def main(args: Array[String]) {
    // named argument
    printInt(b = 5, a = 7);
    
    printInt(5, 7);
   
    printStrings("Scala","Java" ,"Ocaml")
    
    for (i <- 1 to 10)
       println( "Factorial of " + i + ": = " + factorial(i) )
    // default value parameters   
   println(addInt())
  }
  
  def printInt(a: Int, b: Int) = {
    println("Value of a : " + a);
    println("Value of b : " + b);
  }
  // dynamic parameters
  def printStrings(args: String*):Unit = {
    var i: Int = 0;
    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg);
      i = i + 1;
    }
  }
  
  /// test recursive
    def factorial(n: BigInt): BigInt = {  
      if (n <= 1)
         1  
      else    
      n * factorial(n - 1)
   }
  
    // default parameters value
  def addInt( a:Int=5, b:Int=7 ) : Int = {
      var sum:Int = 0
      sum = a + b

      return sum
   }
  
}
