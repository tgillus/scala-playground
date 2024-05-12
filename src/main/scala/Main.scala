import scala.annotation.tailrec

def sum1(f: Int => Int, a: Int, b: Int): Int =
  if a > b then 0
  else a + sum1(f, a + 1, b)

def sum2(f: Int => Int, a: Int, b: Int) =
  @tailrec
  def loop(a: Int, acc: Int): Int =
    if a > b then acc
    else loop(a + 1, acc + f(a))
  loop(a, 0)

@main def playground(): Unit =
  println(s"Sum of List: ${Lists.sum(List(1, 2, 3))}")
  println(s"Max of List: ${Lists.max(List(1, 2, 5, 15, 6, 7))}")
  println(s"Sum 1: ${sum1(x => x, 1, 4)}")
  println(s"Sum 2: ${sum2(x => x, 1, 4)}")
