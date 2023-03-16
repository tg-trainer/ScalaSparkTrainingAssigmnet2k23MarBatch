package RitikKuril
import Question3.Fibonacci
import Question2.Factorial
import Question1.Perfect
import LastElementList.Last
import DropNelement.drop


object Main extends App {

  //assert(Fibonacci(3,0,1)==2,"wrong answer");
 // assert(Factorial(5,1)==120,"wrong answer");
  //assert(Perfect(3)==3,"wrong answer");
 // assert(Last(list=List(1,2,3,4))==4,"wrong answer");
  assert( drop(List(1,2,3,4,5),2)==List(1,3,4,5),"wrong answer" );
}
