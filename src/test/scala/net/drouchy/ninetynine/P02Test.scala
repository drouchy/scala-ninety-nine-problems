package net.drouchy.ninetynine

import org.scalatest.FunSpec
import org.scalatest.Matchers

import net.drouchy.ninetynine.ListUtils._

class P02Test extends FunSpec with Matchers {

  describe("ListUtils") {
    describe("penultimate") {
      it("Finds the last element of a list") {
        penultimate(List(1, 1, 2, 3, 5, 8)) should equal(5)
      }
    }

    describe("lastRecursive") {
      it("Finds the last element of a list") {
        penultimateRecursive(List(1, 1, 2, 3, 5, 8)) should equal(5)
      }
    }
  }
}
