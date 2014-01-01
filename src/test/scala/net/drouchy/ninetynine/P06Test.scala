package net.drouchy.ninetynine

import org.scalatest.FunSpec
import org.scalatest.Matchers

import net.drouchy.ninetynine.ListUtils._

class P06Test extends FunSpec with Matchers {

   describe("ListUtils") {
     describe("isPalindrome") {
       it("retuns false if the list is not a palindrome") {
         isPalindrome(List(1, 2, 3, 2, 3)) should equal(false)
       }

       it("Finds out whether a list is a palindrome") {
         isPalindrome(List(1, 2, 3, 2, 1)) should equal(true)
       }
     }
   }
 }
