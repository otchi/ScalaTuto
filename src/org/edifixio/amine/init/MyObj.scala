package org.edifixio.amine.init

class MyObj {
  var name: String = null
  var nbr: Int = 0;
  
//  override def toString():String ={ return"MyObj["+name+","+nbr+"]"}
  // best is 
  override def toString()="..MyObj["+name+","+nbr+"]"
}