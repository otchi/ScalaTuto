package org.edifixio.amine.init

object TestingFunction {
 
}
package subpack {
  abstract class add {
    def functionName(v: Int): Int

  }
  object add {
    def addInt(a: Int, b: Int): Int = {
      var sum: Int = 0
      sum = a + b

      return sum
    }

  }

  class add1 {
    def addInt(a: Int, b: Int): Int = {
      var sum: Int = 0
      sum = a + b

      return sum
    }
  }
  
  object Hello{
   def printMe( ) : Unit = {
      println("Hello, Scala!")
   }
  }
  

}