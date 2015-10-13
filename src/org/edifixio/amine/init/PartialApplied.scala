package org.edifixio.amine.init

import java.util.Date

object PartialApplied {
  val date = new Date
  //partially applied function
  val logWithDate=log(date.getTime,_ :String)
  // currying function
  def strcat(s1: String)(s2: String) = s1 + s2
  
  //Alternatively, you can 
  //also use the following syntax to define 
  //a curried function ...
  
  //def strcat(s1: String) = (s2: String) => s1 + s2

  def main(args: Array[String]) {
    //-------------------------------------
    val date = new Date
    log(date.getTime, "message1")
    Thread.sleep(1000)
    log(date.getTime, "message2")
  
    //-------------------------------------
    
    logWithDate("pmessage1")
    Thread.sleep(1000)
    logWithDate( "pmessage2")
    Thread.sleep(1000)
    
    // -----------------------------
    println(strcat("cc ")("amine"))
    
  }

  def log(date: Long, message: String) = {
    println(date + "----" + message)
  }
  
}