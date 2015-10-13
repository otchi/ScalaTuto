package org.edifixio.amine.functionsOpt

object PattrenMatchingWithDataTypes {
  
  def main(args: Array[String]) {
    val c: Shape = Circle(2);
    val r: Shape =  Rectangle(4, 5)
    println(area(c));
    println(area(r))
    /*------------------------------------------------*/
    val n1=Node(20, Leaf(10), Leaf(30))
    val n2=Node(40, Leaf(37), Leaf(50))
    val n=Node(35,n1,n2)
    println(sumTree(n))
  }
  /*************** shape *****************************************/
  sealed abstract class Shape
  case class Circle(r: Int) extends Shape
  case class Rectangle(h: Int, w: Int) extends Shape

  def area(a: Shape) = a match {
    case Circle(r) => 3.14 * r * r
    case Rectangle(h, w) => h * w
    case _ => -1
  }
  
  /*************** binary tree *************************************/
  sealed abstract class Tree
  case class Node(value: Int,left:Tree,right:Tree) extends Tree
  case class Leaf(value: Int) extends Tree
  
  def sumTree(t:Tree):Int =t match{
    case Leaf(value) => value
    case Node(value,left,right) => value+sumTree(left)+sumTree(right)
  }
  


}