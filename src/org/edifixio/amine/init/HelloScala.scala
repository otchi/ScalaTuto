package org.edifixio.amine.init

object helloScala {
// difference between class and object is that object is instance(one), and for function we must do "=" wen we define 
  // function so we the return statement can be implicite
  def main(args: Array[String]) {

    println("hello sscala")
    println(1e30f)
    //------------------------------------------
    var varTest: String = "cc" // mutable variable
    println(varTest)
    val valTest: String = "kk" // non mutable , is constant
    println(valTest)
    //------------------------------------------
    val myVal = "cc" // inference of type
    var myVar = "kk"
    println(myVal)
    println(myVar)
    //-------------------------------------------
    val (multAssign1: Int, multAssign2: String) = Pair(40, "foo")
    println(multAssign1 + "//" + multAssign2);
    val (mutMultAssign1, mutMultAssign2) = Pair(50, "too")
    println(mutMultAssign1 + "//" + mutMultAssign2);
    var (vmutMultAssign1, vmutMultAssign2) = Pair(50f, "vtoo")
    println(vmutMultAssign1 + "//" + vmutMultAssign2);

    (new p.Super).f()
    // (new p.Super).d() Error
    
    // binary operator
    println((15>>2).toBinaryString);
    println((15<<2).toBinaryString);
    println((31>>>2).toBinaryString);
   // println(011000011)
    p.Hello.printMe();

  }

}

package p {
  class Super {
    def f() { println("f") } // public equivalent
    protected def d() { f() }
  }
  class Sub extends Super {
    f()
  }
  class Other {
    // (new Super).f() // Error: f is not accessible
  }
  
  object Hello{
   def printMe( ) : Unit = {
      println("Hello, object Scala!")
   }
  }
  
}


