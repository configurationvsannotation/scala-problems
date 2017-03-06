package com.sage.collections.sequence

import scala.collection.immutable.Seq

object SeqExample extends App{
  val x = Seq(2,1,30,-2,20,1,2,0)
  for(t <- x.tails){
    println(t)
  }
  /*
  List(2, 1, 30, -2, 20, 1, 2, 0)
  List(1, 30, -2, 20, 1, 2, 0)
  List(30, -2, 20, 1, 2, 0)
  List(-2, 20, 1, 2, 0)
  List(20, 1, 2, 0)
  List(1, 2, 0)
  List(2, 0)
  List(0)
  List()
   */
  val ints: Seq[Int] = x.tails map (_.take(2)) filter (_.length > 1) map (_.sum) toList

  println(ints)
  // List(3, 31, 28, 18, 21, 3, 2)

  println(Seq(2,1,30,-2,20,1,2,0).sliding(2).map(_.sum).toList)
  // List(3, 31, 28, 18, 21, 3, 2)

}
