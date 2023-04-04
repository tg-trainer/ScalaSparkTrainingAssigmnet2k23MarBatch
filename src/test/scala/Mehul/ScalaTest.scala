package Mehul

import Mehul.Assignment6_Q2.nthPrime
import org.scalatest.funspec.AnyFunSpec
class ScalaTest extends AnyFunSpec  {
    describe( "nthprime method") {
      it("should return the correct value for the 3rd prime number") {
        val n = 3
        val expected = 5
        val result = nthPrime(n)
        assert(result == expected)
      }
    }




  }

