package net.drouchy.ninetynine

import java.util.NoSuchElementException

object ListUtils {

  def last[A](list: List[A]): A = {
    list.last
  }

  def lastRecursive[A](list: List[A]): A = {
    list match {
      case head :: Nil  => head
      case _    :: tail => lastRecursive(tail)
    }
  }

  def penultimate[A](list: List[A]): A = {
    val size = list.size
    list.take(size-1).last
  }

  def penultimateRecursive[A](list: List[A]): A = {
    list match {
      case head :: _ :: Nil => head
      case head :: rest     => penultimateRecursive(rest)
    }
  }

  def nth[A](index:Int, list: List[A]): A = {
    list(index)
  }

  def nthRecursive[A](index:Int, list: List[A]): A = {
    (index, list) match {
      case ( 0,     head :: _    ) => head
      case ( index, head :: rest ) => nthRecursive(index-1, rest)
      case ( _,     Nil          ) => throw new NoSuchElementException
    }
  }

  def length[A](list: List[A]): Long = {
    list.length
  }

  def lengthRecursive[A](list: List[A]): Long = {
    list match {
      case Nil       => 0
      case _ :: tail => 1 + lengthRecursive(tail)
    }
  }

  def reverse[A](list: List[A]): List[A] = {
    list.reverse
  }

  def reverseRecursive[A](list: List[A]): List[A] = {
    list match {
      case head :: tail :: Nil => List(tail, head)
      case head :: rest        => reverseRecursive(rest) ::: List(head)
    }
  }
}
