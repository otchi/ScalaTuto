package org.edifixio.amine.init
object PatternMatchingTuto {

  val a = 10;
  //a=a+1; // not work is const
  def main(args: Array[String]) {
    println(a);
    // PatternMatchingTuto.a=10;
    var c1 = new MyClass
    var c2 = new MyClass

    println(c1 + "-----" + c2)
    c2.nbrStatic = 2;
    c2.static.current=40;
    println(c1 + "-----" + c2)
  }

  class MyClass {
    var static = Static
    var nbrStatic: Int = _
    
    override def toString = static + "//" + nbrStatic
  }
  
  object Static {
    var current = 0
    override def toString = current.toString()
  }

}