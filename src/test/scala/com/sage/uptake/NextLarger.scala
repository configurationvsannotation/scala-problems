package com.sage.uptake

import org.scalatest.FlatSpec


class NextLarger  extends FlatSpec{

  "Scenarios that determine the next highest number" should "be valid" in {
    assert(next(69) == Some(96))
    assert(next(369) == Some(396))
    assert(next(369) == Some(396))
    assert(next(98369) == Some(98396))
    assert(next(93869) == Some(93896))
    assert(next(199899) == Some(199989))
    assert(next(89999) == Some(98999))
    assert(next(1002) == Some(1020))
    assert(next(999998) == None)
  }
  def next(num:Int):Option[Int] = {
    val options = generateOptions("",num.toString,Set()).map(_.toInt).toList.sorted
    val index: Int = options.indexOf(num)
    if(options.length - 1 == index) None else Some(options(index+1))
  }
  private def shift(s:String):String = {
    s.takeRight(s.length - 1) + s.take(1)
  }
  def generateOptions(prefix:String, s: String,l:Set[String]):Set[String] = {
    var x = s
    var li = l
    for(i <- 0 until s.length){
      x = shift(x)
      li = li + (prefix + x) ++ generateOptions(prefix + x.take(1),x.substring(1),li)
    }
    li
  }

}
