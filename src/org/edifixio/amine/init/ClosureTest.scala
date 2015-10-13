package org.edifixio.amine.init

object ClosureTest {
  def main(args :Array[String]){
    val multiplier = (i:Int) => i * 10
    println(multiplier(10))
    var factor = 3
    val multiplier1 = (i:Int) => i * factor
    println(multiplier1(10))
  }
  
}