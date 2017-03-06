package com.sage.types

object TypeKeyword extends App{
  object Resources {
    type Resource = {
      def close():Unit
    }
    type X = Int
    val x:X = 22
    def closeResource(r:Resource) = {
      r.close()
    }
  }
  println(Resources.x)
  Resources.closeResource(System.out)
  System.out.println("hello") // not going to print out

}
