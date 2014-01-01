package net.drouchy.ninetynine

import org.scalatest.FunSpec
import org.scalatest.Matchers

import net.drouchy.ninetynine.ListUtils._

class P05Test extends FunSpec with Matchers {

   describe("ListUtils") {
     describe("reverse") {
       it("Reverses a list") {
        reverse(List(1, 1, 2, 3, 5, 8)) should equal(List(8, 5, 3, 2, 1, 1))
       }
     }

     describe("reverseRecursive") {
       it("Reverses a list") {
         reverseRecursive(List(1, 1, 2, 3, 5, 8)) should equal(List(8, 5, 3, 2, 1, 1))
       }
     }
   }
 }
