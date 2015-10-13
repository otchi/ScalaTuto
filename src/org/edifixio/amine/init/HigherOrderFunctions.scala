package org.edifixio.amine.init

object HigherOrderFunctions {
  var inc = (x:Int) => x+1
  var x = inc(7)-2
  var userDir = () => { System.getProperty("user.dir") }
  
  def main(args: Array[String]) {

      println( apply( layout, 10) )
      
      // nested function
      println(factorial(0));
      
      // Anonymous function
      println(inc);
      println(inc(1));
      println(x);
      print(userDir())

   }
  
  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString() + "]"
  // we must specify the begin argument
  def complexFunction (f: Object => String,v: Object) = f(v)
  
  
  // nested function
  
    def factorial(i: Int): Int = {
      def fact(i: Int, accumulator: Int): Int = {
        println("ici")
         if (i <= 1){
            accumulator
         }else{
            fact(i - 1, i * accumulator)
         }
      }
      println("ici last")
      // here is called function
      fact(i, 1)
   }
  
}