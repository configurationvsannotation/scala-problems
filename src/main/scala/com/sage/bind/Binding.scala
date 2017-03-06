package com.sage.bind
import java.util.{List => JList,ArrayList => JArrayList}

object Binding extends App{

  val list:JList[Int] = new JArrayList[Int]()
  list.add(1)
  list.add(2)
  println(list)





}