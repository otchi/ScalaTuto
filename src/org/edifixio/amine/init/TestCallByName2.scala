package org.edifixio.amine.init

// call by name is used to call a execute a code function 
object TestCallByName2 {
  var c = 5;
  
  def main(args: Array[String]){
     callByName(dispTime(5))
  }
  
  def dispTime(x : Int) : Long ={
     println("time : "+x)
     return System.nanoTime()
  }
  
  def callByName(f: => Long){
     println("by name call: "+f) // the program execute code and display return value
      // execude in this block and not evaluate out of block and display hier
     // the diffrence is that other type call is get only value 
     // and execute function out of the function
     println("by name call: "+f)
     
     f
     f
  }
  
}