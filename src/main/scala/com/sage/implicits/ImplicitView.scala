package com.sage.implicits

object ImplicitView extends App{

  implicit def intToString(x:Int) = x.toString

  def printString(x:String): Unit ={
    println(x)
  }

  printString(2)
  printString("245")

}
