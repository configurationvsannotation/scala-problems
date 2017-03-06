package com.sage.collections.sequence

import scala.collection.LinearSeq

object LinearSeqExample extends App{

  val seq = LinearSeq(2,3,5,7,8)
  println(seq.getClass.getName)
  println(seq.head)
  println(seq.tail)

  def printSequence(seq: Seq[Any]): Unit ={
    seq match {
      case head::tail =>
        println(head)
        printSequence(tail)
      case Nil =>
        println("empty")
    }
  }
  printSequence(seq)
  printSequence(Seq())
}
