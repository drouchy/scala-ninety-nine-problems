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
}
