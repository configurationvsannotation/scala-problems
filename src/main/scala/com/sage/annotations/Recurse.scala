package com.sage.annotations

import scala.annotation.tailrec

case class Node(name: String, edges: List[Node] = Nil)

object Recurse extends App{
  println("recurse")
  def search(start: Node, p: Node => Boolean) = {
    @tailrec
    def loop(nodeQueue: List[Node], visited: Set[Node]): Option[Node] =
      nodeQueue match {
        case head :: tail if p(head) =>
          Some(head)
        case head :: tail if !visited.contains(head) =>
          loop(tail ++ head.edges, visited + head)
        case head :: tail =>
          loop(tail, visited)
        case Nil =>
          None
      }

    loop(List(start), Set())
  }
  search(Node("biff"),n => n.name == "biff")

}
