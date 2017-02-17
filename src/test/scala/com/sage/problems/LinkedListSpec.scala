package com.sage.problems

import com.sage.models.LinkedListNode
import org.scalatest.FlatSpec

class LinkedListSpec extends FlatSpec{

  "Building a linked list with a seq of ints" should "matain the order" in {
    var node = LinkedListNode(1,4,5,6);
    assertValues(node,1,4,5,6)
  }
  "Removing an element from the middle of a linked list" should "result in a smaller list" in {
    val node = LinkedListNode(1,4,5,6,7,5,0);
    assertValues(LinkedListNode.remove(node,6),1,4,5,7,5,0)
  }
  "Removing an element from the begining of a linked list" should "result in a smaller list" in {
    val node = LinkedListNode(1,4,5,6,7,5,0);
    assertValues(LinkedListNode.remove(node,1),4,5,6,7,5,0)
  }
  "Removing an element from the end of a linked list" should "result in a smaller list" in {
    val node = LinkedListNode(1,4,5,6,7,5,0);
    assertValues(LinkedListNode.remove(node,0),1,4,5,6,7,5)
  }

  "Removing an non existent element from the end of a linked list" should "result in a with the same list" in {
    val node = LinkedListNode(1,4,5,6,7,5,0);
    assertValues(LinkedListNode.remove(node,88),1,4,5,6,7,5,0)
  }

  def assertValues(node:LinkedListNode,data:Int*): Unit ={
    var nd = node;
    data.foreach{dt =>
      assert(nd.data == dt)
      nd = nd.next
    }
  }

}
