package com.sage.problems

import java.util.regex.Pattern
import java.util.stream.IntStream

import scala.collection.mutable.ArrayBuffer

object CharacterRecognition {

  def solution(s: String, t: String): Boolean = {
    possibleMatch(numWithSpaces(s), numWithSpaces(t))
  }
  private def possibleMatch(s:String, t:String):Boolean = {
    if(s.length != t.length){
      false
    }else{
      var doMatch = true
      IntStream.range(0,s.length).toArray.foreach( i =>
        if(s.charAt(i) != ' ' && t.charAt(i) != ' ' && s.charAt(i) != t.charAt(i)){
          doMatch = false
        }
      )
      doMatch
    }
  }

  private def numWithSpaces(s:String): String ={
    val matcher = Pattern.compile(".*?([0-9]+).*?").matcher(s)
    val nums = ArrayBuffer[Int]()
    while(matcher.find()){
      nums += matcher.group(1).toInt
    }
    var finalResult = s
    nums.sorted.reverse.foreach{ n =>
      finalResult = finalResult.replace(n.toString, " " * n)
    }
    finalResult
  }
}
