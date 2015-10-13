package org.edifixio.amine.init

object MainCollection {

  def main(args: Array[String]) {
    def fruit: List[String] = List("bananas", "oranges");
    println(fruit)
    val fruit1 = "bananas" :: ("pears" :: ("oranges" :: Nil))
    println(fruit1)
    println(fruit1.head + "//" + fruit1.tail);
    println(fruit ::: fruit1);
    // very important  make a object duplication 
    // is very easy
    var f = List.fill(2)(new MyObj);
    println(f.apply(1));
    f.apply(1).name = "cc";
    println(f.apply(1));
    println(f.apply(0));
    println("---"+f(1));
    ////////////////////////////////////////
    def fruit2 = fruit1.::("kiwi");
    println(fruit2)
    /// review a functions of list its very useful

    /////////////// SET ////////////////////////
    var s: Set[Int] = Set(1, 2, 3)
    var s2: Set[Int] = Set(2, 3, 4)
    println(s & s2)
    println(s.&(s2))
    println(s | s2)
    println(s ++ s2) //is set distinct element
    println(s -- s2)
    ////////////// MAP ///////////////////////
    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
    println(colors)
    var A: Map[Char, Int] = Map()
    A += ('I' -> 1);
    A += ('J' -> 5)
    A += ('K' -> 10)
    A += ('L' -> 100)
    println(A)
    
    colors.keys.foreach{ i =>  
                           print( "Key = " + i +"\t")
                           println(" Value = " + colors(i) )}
    println(A('K'))
    
    //////////////// TUPLE ///////////////////////////
    
    val t=(1,"cc",new MyObj)
    val t1=Tuple3(1,"cc",new MyObj);
    t.productIterator.foreach{ i =>println("Value = " + i )}
    
    ////////// option //////////////////////////////////////////
      val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
      println("capitals.get( \"France\" ) : " +  capitals.get( "France" ))
      println("capitals.get( \"India\" ) : " +  capitals.get( "India" ))
      
        println("capitals.get( \"France\" ) : " + show(capitals.get( "Japan")) )
      println("capitals.get( \"India\" ) : " +  show(capitals.get( "India" )))

  }
  
   def show(x: Option[String]) = x match {
      case Some(s) => s
      case None => "?"
   }
}