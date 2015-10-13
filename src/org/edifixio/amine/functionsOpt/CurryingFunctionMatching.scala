package org.edifixio.amine.functionsOpt

object CurryingFunctionMatching {
  //////// and pattern matching
  def main(args: Array[String]){
    println(addA(5, 4))
    println(addB(4)(5))
    println(fun(List(0,1,2)));
    println(fun(List(1,1,2)));
    println(fun(List(0,1,2,3)))
    println(lenght(List(1,1,5,4,5,6,6,54)))
  }
  
  def addA(x :Int, y: Int )=x+y;
  // currying
  def addB(x: Int):Int=>Int= y=>x+y
  // pattern matching
  def fun(a :List[Int])= a match {
    case(List(0,p,q))=>p+q
    case _=> -1
  }
  // lenght of liste with patten matching
  def lenght(a : List[Int]):Int = a match{
    case Nil => 0
    case h::t=> 1+lenght(t);
  }
}