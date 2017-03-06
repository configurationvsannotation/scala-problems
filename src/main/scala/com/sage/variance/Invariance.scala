package com.sage.variance

object Invariance extends App{

  def doStuff[T](human: T): Unit ={
    println(human)
  }
  doStuff(new Human)
  doStuff(new Man)

}


