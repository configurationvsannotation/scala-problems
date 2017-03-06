package com.sage.problems

import org.scalatest.FlatSpec

class VamsiReg extends FlatSpec{
  "stuff" should "happen" in {
    var s ="\\/:*?\"<>|laskdjdfja\\/:*\"<>|"

    val all = s.replaceAll("([/:*?\"|<>]|\\\\)","")
    println(all)
  }

}
