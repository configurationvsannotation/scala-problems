package com.sage.annotations

import scala.annotation.switch

object Switch extends App{

  List[Any](1,2,3,"4").foreach{x => (x: @switch) match {
    case 1 => println("Lonely Number")
    //case x:String => println("String") // warning with commented in (no tableswitch optimization
    case _ => println("not so much")
  }

  }

}
