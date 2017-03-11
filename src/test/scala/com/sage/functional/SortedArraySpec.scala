package com.sage.functional

import org.scalatest.FlatSpec

class SortedArraySpec extends FlatSpec{

  "An array on regardless of type" should "be verified sorted "in {
    assert(SortedArray.isSorted(Array(1,2,5,6),(i:Int, j:Int) => j > i) == true)
    assert(SortedArray.isSorted(Array(1,2,7,6),(i:Int, j:Int) => j > i) == false)
    assert(SortedArray.isSorted(Array("Angelina","Mark","Julie"),(i:String, j:String) => j > i) == false)
    assert(SortedArray.isSorted(Array("Angelina","Julie","Mark"),(i:String, j:String) => j > i) == true)
  }

}
