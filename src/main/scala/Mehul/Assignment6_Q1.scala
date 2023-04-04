package Mehul

import scala.collection.immutable.Nil.:::
import scala.collection.mutable.ListBuffer
object Assignment6_Q1 {
  // taken help from shlok's code
  def Duplicate_Sublists_from_list(list: List[Int],result:List[List[Int]]=List()) :List[List[Int]] =
  {
    if(list.isEmpty){
      result
    }
    else if(result.isEmpty){

      Duplicate_Sublists_from_list(list.tail,result++List(List(list.head)))
    }
    else if(result.last.head == list.head){
      Duplicate_Sublists_from_list(list.tail, result.take(result.length-1)++List(result.last++List(list.head)) )
    }
    else{
      Duplicate_Sublists_from_list(list.tail, result++List(List(list.head)))
    }
  }
}





