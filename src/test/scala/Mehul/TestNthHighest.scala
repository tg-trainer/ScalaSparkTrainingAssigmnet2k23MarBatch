package Mehul

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import Mehul.Assignment6_Q3.NthHighest
import Mehul.Assignment6_Q6.Count_Vowel_in_Words

import scala.List
class TestNthHighest extends AnyFlatSpec with Matchers {
  behavior of "nth highest"
  it should("checking for 2 nd highest should get 13 as answer ") in{
    assert(NthHighest(List(2,8,9,12,1,6,23,13,5,7),2)==13,"wrong answer")
  }
  it should("checking for 4 th highest should get 9 as answer ") in{
    assert(NthHighest(List(2,8,9,12,1,6,23,13,5,7),4)==9,"wrong answer")
  }
  behavior of "count vowel in words"
  it should("return the integer list with count of vowel in each words from given test list") in
  {
     val result=List(2,3,5,2)
     Count_Vowel_in_Words(List("apple","banana","waAtermelon","pear")) shouldBe  result
  }

}
