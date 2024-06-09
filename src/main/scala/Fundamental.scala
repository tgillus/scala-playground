import scala.annotation.tailrec

object Fundamental:
  def multByTen(x: Int) =
    x * 10

  def bothNonZero(x: Int, y: Int) =
    x != 0 && y != 0

  def sum(x: Int) =
    @tailrec
    def helper(n: Int, acc: Int): Int =
      n match
        case 0 => acc
        case _ => helper(n - 1, acc + n)
    helper(x, 0)

  def pow(x: Int, n: Int) =
    @tailrec
    def helper(n: Int, acc: Int): Int =
      n match
        case 0 => acc
        case _ => helper(n - 1, acc * x)
    helper(n, 1)
