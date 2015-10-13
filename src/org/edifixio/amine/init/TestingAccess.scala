package org.edifixio.amine.init

class testingAccess {
  class Super {
    protected def f() { println("f") }
  }
  class Sub extends Super {
    f()
  }
  class Other {
    //(new Super).f() // Error: f is not accessible
  }

}
package society {
  package professional {
    class Executive {
      private[professional] var workDetails = null
      private[society] var friends = null
      private[this] var secrets = null

      def help(another: Executive) {
        println(another.workDetails)
        // println(another.secrets) //ERROR
      }
    }
    
    package society {
      package professional {
        class Executive {
          private[professional] var workDetails = null
          // can be accessed by all calss in 
          //this package "professional"
          private[society] var friends = null
          // can be accessed by all class in 
          //package "professional"
          private[this] var secrets = null
          // we must access by this ref this

          def help(another: Executive) {
            println(another.workDetails)
            // println(another.secrets) //ERROR
          }
        }
      }
    }
  }
}
