package com.sage.option

import java.io.File

object OptionExamples extends App{

  def directoryContents(pathToDir:Option[String]): Unit ={
    pathToDir.map(p => new File(p)).filter(_.exists()).map(f => f.listFiles()) match {
      case Some(files) => files.foreach(f => println(f.getAbsolutePath))
      case None => println(s"$pathToDir does not exist")
    }

  }

  directoryContents(Some("/Users/msage/personal/_git/scala-problems"))
  directoryContents(Some("/ouch"))
  directoryContents(None)

  for(o <- Some("Jack Baur")){
    println(o)
  }
  for(o <- None){
    println(o)
  }

  val user = Some("Mark")
  val password = None;//Some("password")

  for(u <- user;
      p <- password; if(login(u,p))){
    println("You are in the system")
  }

  def login(user:String, password:String):Boolean = {
    user == "Mark" && password == "password"
  }

}
