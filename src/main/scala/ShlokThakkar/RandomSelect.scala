package ShlokThakkar

import scala.collection.mutable.ListBuffer
import scala.util.Random

object RandomSelect {


  def RandomNum(n: Int, list: List[Char], list1: ListBuffer[Char] = ListBuffer()): List[Char] = {
    if(n>list.length)
      {
        println("Wrong Input")
        list
      }
    else {
      val randomNumber = new Random()
      if(n==0)
      {
        list1.toList
      }
      else {
        val x = randomNumber.nextInt(list.length - 1)
        list1.addOne(list(x))
        RandomNum(n-1,list.filter(_ != list(x)), list1)
      }
    }
  }
}
