package org.edifixio.amine.functionsOpt

object firtTest {
  var q = 0;
  val v=q*2;
  def d :Int=q*2 
  def main(args :Array[String]){
    println(fun(10));
    println(v)
    q=3
    //by value
    println(v)
    println(d)
    // with function
    println(abs(fun))
    // with anonymous function
    println(abs(x=>x*15))
    // pattern matching
    println(errorMsg(2))
  //  println(sum(10000)) stack over flow with classic rec
    println(sum(10000, 0))
    
    
  }

  def abs(f:Int=>Int):Int={
    f(3)
  }

  // the last is returned last is returned
  def fun(a : Int):Int={
    a+1
    a-2
    a*3
  }
  
//    ---------------------------------------
//      def add(a,b)=a+b not work 
//      isn't  Hindley-Milner type inference
  
  
  // simple pattern matching 
  def errorMsg(errorCode: Int)= errorCode match{
    case 1 => "File invalide"
    case 2 => "permision denied"
  }
  
  // classic recursivity can beget a stackoverflow
  def sum(n : Int ):Int = if(n==0) 0 else  n+sum(n-1) 
  // to avoid stack over in big wen the function is called
  //too often we use tail calls
  def sum(n:Int,acc: Int):Int = if(n==0) acc else sum(n-1,n+acc)

}