package com.sage.option

object LiftFunction extends App{

  val nonOptionFunction = (x:Int, y:Int) => x * y

  println(nonOptionFunction(3,4))

  def lift[A,B,C](funct:Function2[A,B,C]):Function2[Option[A],Option[B],Option[C]]= {
    (a:Option[A], b:Option[B]) =>  for(aa <- a;  bb <- b)  yield funct(aa,bb)
  }

  val optionFunction = lift(nonOptionFunction)
  println(optionFunction(None,Some(2)))
  println(optionFunction(Some(8),Some(2)))

}
