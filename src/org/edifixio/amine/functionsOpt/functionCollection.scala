package org.edifixio.amine.functionsOpt

object functionCollection {
  def main(args:Array[String]){
    val a =Range(1,7);
    println(a)
    val b= a.map { x => x*a(2) }
    println(b)
    val c=b.filter { x => x>9 }
    println(c)
    val d=a.reduce((x,y)=>x+y);
    println(d)
    ////////////////////////////////////////
    def even(x:Int)=(x%2)==0
    val a1=Range(0,13,2)
    val a2=Range(1,13,2)
    println("----------------------------------");
    println(a1);
    println(a2);
    println("-------- for all--------------------------");
    println(a.forall(even))
    println(a1.forall(even))
    println("------------ exist ----------------------");
    println(a1.exists(even))
    println(a2.exists(even))
    println("------------ take while----------------------");
    println(List(2,4,6,7,8).takeWhile(even))
    println("------------ partition ----------------------");
    println(a.partition(even))
  }
}