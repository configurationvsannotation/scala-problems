package com.sage.problems

class TwoStringsSame {

  def sameCharacters(s1:String, s2:String): Boolean ={
    if(Option(s1).isEmpty || Option(s2).isEmpty){
      false
    }else{
      new String(s1.toCharArray.sorted).equals(new String(s2.toCharArray.sorted))
    }
  }

}
