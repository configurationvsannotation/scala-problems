package com.sage.collections.zip

object ZipExample extends App{

  val name = Iterable("Mark","Babs","Julie")
  val zipCode = Iterable("60606","83401","08907")
  for((x, y) <- name.zip(zipCode)){
    println(s"$x lives in zip code: $y")
  }

}
