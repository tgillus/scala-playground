class FundamentalTest extends munit.FunSuite {
  test("multiplies a given integer, x, by 10") {
    assertEquals(Fundamental.multByTen(10), 100)
  }

  test("determines if two integers, x and y, are both non-zero") {
    assertEquals(Fundamental.bothNonZero(1, 2), true)
    assertEquals(Fundamental.bothNonZero(0, 1), false)
    assertEquals(Fundamental.bothNonZero(1, 0), false)
    assertEquals(Fundamental.bothNonZero(0, 0), false)
  }

  test("sums integer values from zero up to given integer, x") {
    assertEquals(Fundamental.sum(0), 0)
    assertEquals(Fundamental.sum(1), 1)
    assertEquals(Fundamental.sum(2), 3)
    assertEquals(Fundamental.sum(3), 6)
  }

  test("raises an integer to the power of another integer") {
    assertEquals(Fundamental.pow(2, 0), 1)
    assertEquals(Fundamental.pow(2, 1), 2)
    assertEquals(Fundamental.pow(2, 2), 4)
    assertEquals(Fundamental.pow(2, 3), 8)
  }
}
