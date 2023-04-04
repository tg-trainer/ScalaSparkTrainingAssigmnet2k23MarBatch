package Mehul

import Mehul.Assignment5.List_last_element
import Mehul.Assignment6_Q1.Duplicate_Sublists_from_list
import Mehul.Assignment6_Q10.SplitListFunction
import Mehul.Assignment6_Q11.insert_in_list
import Mehul.Assignment6_Q2.nthPrime
import Mehul.Assignment6_Q3.NthHighest
import Mehul.Assignment6_Q4.division_
import Mehul.Assignment6_Q5.solve
import Mehul.Assignment6_Q6.Count_Vowel_in_Words
import Mehul.Assignment6_Q7.BuiltIn
import Mehul.Assignment6_Q8.Duplicate_elements_in_list
import Mehul.Assignment6_Q9.DropNthElement

import scala.collection.mutable.ListBuffer
object Mainrun extends App {
  //get the last element from the list
  assert(List_last_element(List(2,4,6,8,10))==10,"wronganswer")
  //Assignemnt6_q1
  assert(Duplicate_Sublists_from_list(List(1,1,1,1,2,3,2,2,2,2,2,4,4,4,6,6,6,6))==List(List(1,1,1,1),List(2),List(3),List(2,2,2,2,2),List(4,4,4),List(6,6,6,6)))
  //Assignment6_q2
  assert(nthPrime(5)==11,"wronganswer")
  //Assignment6_q3
  assert(NthHighest(List(2,8,9,12,1,6,23,13,5,7),2)==13)
  //Assignment6_q4
  assert(division_(List(1,2,3,4,5,6),3)==1)
  //Assignment6_q5
  print(  solve(List(2,3,4,5,6,7,8,9,10),9))
  //Assignment6_q6
 assert(Count_Vowel_in_Words(List("apple","banana","waAtermelon","pear"))==List(2,3,5,2),"wronganswer")
  //Assignment6_q7
  assert(BuiltIn(List("today","is","a","wonderful","day"))==List("a","is","day","today","wonderful"))
  //Assignment6_q8
  assert(Duplicate_elements_in_list(List('a','b','c','d'),3)==List('a','a','a','b','b','b','c','c','c','d','d','d'))
  //Assignment6_q9
  assert(DropNthElement(3,List(2,4,6,8,10,12,14,16))==List(2,4,6,10,12,14,16))
  //Assignment6_q10
  val split_part=new ListBuffer[Int]
  print(List(2,4,6,8,9,10,1,2).take(3),SplitListFunction(3,List(2,4,6,8,9,10,1,2),List(2,4,6,8,9,10,1,2).length,split_part))
  //Assignment6_q11
 assert(insert_in_list(List(2,3,4,5,6,7,8,9,10),5,90)==List(2, 3, 4, 5, 6, 90, 8, 9, 10))
}
