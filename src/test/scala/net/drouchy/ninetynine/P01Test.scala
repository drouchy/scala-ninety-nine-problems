package net.drouchy.ninetynine

import org.scalatest.FunSpec
import org.scalatest.Matchers

import net.drouchy.ninetynine.ListUtils._

class P01Test extends FunSpec with Matchers {

  describe("ListUtils") {
    describe("last") {
      it("Finds the last element of a list") {
        last(List(1, 1, 2, 3, 5, 8)) should equal(8)
      }
    }

    describe("lastRecursive") {
      it("Finds the last element of a list") {
        lastRecursive(List(1, 1, 2, 3, 5, 8)) should equal(8)
      }
    }
  }

}
