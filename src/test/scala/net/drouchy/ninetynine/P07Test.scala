package net.drouchy.ninetynine

import org.scalatest.FunSpec
import org.scalatest.Matchers

import net.drouchy.ninetynine.ListUtils._

class P07Test extends FunSpec with Matchers {

   describe("ListUtils") {
     describe("flatten") {
       it("Flattens a nested list structure") {
         flatten(List(List(1, 1), 2, List(3, List(5, 8)))) should equal(List(1, 1, 2, 3, 5, 8))
       }
     }

     describe("flattenRecursive") {
       it("Flattens a nested list structure") {
         flattenRecursive(List(List(1, 1), 2, List(3, List(5, 8)))) should equal(List(1, 1, 2, 3, 5, 8))
       }
     }
   }
 }
