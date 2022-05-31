package reddit

// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class MySuite extends munit.FunSuite {
  test("example test that succeeds") {
    val obtained = 42
    val expected = 42
    assertEquals(obtained, expected)
  }

  test("test get_rdd() function") {
    // setup
    val exp_count: Long = 3
    val exp_doubles = List(2, 4, 6)
    def double(x: Int) = x * 2
    // execution
    val rdd = get_rdd
    val out_count = rdd.count()
    val out_doubles = rdd.map(double).collect().sorted.toList
    // validation
    assertEquals(out_count, exp_count)
    assertEquals(out_doubles, exp_doubles)
  }
}
