package org.edifixio.amine.functionsOpt

object NestedFunctionClosures {

  /////////////////////////////////////////////
  def main(args: Array[String]) {
    val f = fun()
    println(f)
    println(f(10))
    fun2()
    val g=compose(sqr1, cube)
    println(g(1)+"//"+g(2));
    val l=(1::(2::(3::(4::Nil))))
    println(l.map { g /*closures*/ })
    println(l.map { cube }.map { sqr })
    val l1=(60::(30::(44::(25::(48::(10::Nil))))))
    println(removeLowScores(l1, 30))
    
  }
  //////////////////////////////////////////
  def sqr(x :Int)= x*x
  def cube(x: Int)= x*x*x
  
  /////////////////////////////////////////// 
  def fun(): Int => Int = {
    def sqr(x: Int): Int = x * x
    sqr
  }
  ///////////////////////////////////////////
  def fun1(y: Int): Int => Int = {
    x => x + y
  }
  def fun2() {
    val f = fun1(10)
    println(f(2))
  }

  ///////////////////////////////////////////
  // composition of function
  def sqr1(x :Int)=x*x
  def cube1(x:Int)=sqr1(x)*x
  def compose(f : Int=>Int, g:Int=>Int): Int=>Int = x=>f(g(x))

  
  /////////////////////////////////////////////
  def removeLowScores(a :List[Int] ,threHold : Int ): List[Int] ={
    a.filter { score => score >= threHold }
  }
  
}