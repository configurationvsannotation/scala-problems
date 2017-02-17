package com.sage.regex

object Regular extends App{

  val reg = ".*([h]).*(\\1).*".r
  "hellho" match {
    case reg(x,y) => println(x)
    case _ => println("ouch")
  }

}
