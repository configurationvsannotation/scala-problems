package com.sage.problems

import org.scalatest.FlatSpec
import UniqueCharacters._

class UniqueCharactersTest extends FlatSpec{

  "A string containing all unique characters" should "return true" in {
    assert( allCharactersUnique("ytrv") == true)
  }
  "A string containing non unique sequential characters" should "return false" in {
    assert( allCharactersUnique("ytrtv") == false)
  }

}
