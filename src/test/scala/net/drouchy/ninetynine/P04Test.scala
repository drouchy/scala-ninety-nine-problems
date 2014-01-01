package net.drouchy.ninetynine

import org.scalatest.FunSpec
import org.scalatest.Matchers

import net.drouchy.ninetynine.ListUtils._

class P04Test extends FunSpec with Matchers {

   describe("ListUtils") {
     describe("length") {
       it("Finds the number of elements of a list") {
         ListUtils.length(List(1, 1, 2, 3, 5, 8)) should equal(6)
       }
     }

     describe("lengthRecursive") {
       it("Finds the number of elements of a list") {
         lengthRecursive(List(1, 1, 2, 3, 5, 8)) should equal(6)
       }
     }
   }
 }
