package com.sage.types

import com.sage.scope.test.x

object TypeLamda extends App{
  type Callback[T] = Function1[T,Unit]

  val callback:Callback[String] = s => println(s)

  def executeCallback[T](callback: Callback[T], t:T): Unit ={
    callback(t)
  }
  def executeFunction1[T](function: Function1[T,Unit], t:T): Unit ={
    function(t)
  }
  executeCallback(callback,"hello")

  //WIP executeFunction1[({type X[Y] = Function1[Y, Unit]})#X ]((x:Int) => println("hello"))

  /*
  foo[({type X[Y] = Function1[Y, Unit]})#X]( (x : Int) => println(x) )
res7: (Int) => Unit = <function1>
   */

}
