package com.sage.variance

object Contravariance extends App{

  class Ouch[-A]{
    def doStuff[A](a:A)={
      println(a)
    }
  }
  //Function[-Arg,+Return] arguments contravariant, return type is covariant
  val ouch = new Ouch[Man]
  println(ouch.doStuff(new Human))


}
