package com.sage.problems

object UniqueCharacters {

  def allCharactersUnique(s: String): Boolean = {
    !s.matches(".*(.+).*\\1.*")
  }
}
