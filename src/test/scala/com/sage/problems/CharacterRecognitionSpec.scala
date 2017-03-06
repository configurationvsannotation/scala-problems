package com.sage.problems

import org.scalatest.FlatSpec
import CharacterRecognition._

class CharacterRecognitionSpec extends FlatSpec{
  "good stuff" should "happen" in {
    assert(solution("A2Le","2pL1")   == true)
    assert(solution("a10","10a")   == true)
    assert(solution("ba1","1Ad")   == false)
  }
}
