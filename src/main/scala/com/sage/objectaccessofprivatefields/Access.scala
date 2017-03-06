package com.sage.objectaccessofprivatefields

import com.sage.objectaccessofprivatefields.holder.IAmPrivate

object holder {
  case class IAmPrivate(private val x:String)
  object IAmPrivate{
    def whatsMyX(iAmPrivate: IAmPrivate): Unit ={
      println(iAmPrivate.x)
    }
  }
}
object Runner extends App{
  val priv = IAmPrivate("ouch")
  IAmPrivate.whatsMyX(priv)
  //println(priv.x) no can do
}
