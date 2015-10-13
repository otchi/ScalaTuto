package org.edifixio.amine.functionsOpt

// or call by name
object NonStrictEvaluation {
  // lazy mode
  
  lazy val a=hello()// no assigned and no executed
  
  
  def main(args : Array[String]){
    println(fun(hello()))
     println("--- end ---")
    println("--->"+(a+a))
  }
  
  
  
  def hello()={
    println("hello")
    10
  }
  def fun(x : =>Int)={
    println("--- ici ---")
    x+x
   
  }
  
  
}