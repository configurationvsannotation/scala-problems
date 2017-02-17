package com.sage.models

object LinkedListNode{
  def apply(next:LinkedListNode, data:Int): LinkedListNode ={
    new LinkedListNode(next,data)
  }
  def apply(data:Int*):LinkedListNode={
    var last:LinkedListNode = null
    data.reverse.foreach{ dt =>
      var node = LinkedListNode(last,dt)
      last = node;
    }
    last
  }
  def remove(head:LinkedListNode,data:Int): LinkedListNode ={

    if(head.data == data) {
      head.next
    } else{
      var last = head;
      while(last.next != null && last.next.data != data){
        last = last.next
      }
      if(last.next != null)last.next = last.next.next
      head
    }
  }
}

class LinkedListNode(var next:LinkedListNode, var data:Int)
