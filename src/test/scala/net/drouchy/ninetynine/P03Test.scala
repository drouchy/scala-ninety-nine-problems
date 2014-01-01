package net.drouchy.ninetynine

import org.scalatest.FunSpec
import org.scalatest.Matchers

import net.drouchy.ninetynine.ListUtils._

class P03Test extends FunSpec with Matchers {

   describe("ListUtils") {
     describe("nth") {
       it("Finds the Kth element of a list") {
         nth(2, List(1, 1, 2, 3, 5, 8)) should equal(2)
       }

       it("Raises an exception for an invalid index") {
         intercept[NoSuchElementException] {
           nthRecursive(10, List(1, 1, 2, 3, 5, 8))
         }
       }
     }

     describe("nthRecursive") {
       it("Finds the Kth element of a list") {
         nthRecursive(2, List(1, 1, 2, 3, 5, 8)) should equal(2)
       }

       it("Raises an exception for an invalid index") {
         intercept[NoSuchElementException] {
           nthRecursive(10, List(1, 1, 2, 3, 5, 8))
         }
       }
     }
   }
 }
