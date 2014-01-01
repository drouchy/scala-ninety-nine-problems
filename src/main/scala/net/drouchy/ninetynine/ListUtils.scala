package net.drouchy.ninetynine

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
}
