package reddit

// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class MySuite extends munit.FunSuite {
  test("test instantiation of Comment case class") {
    // setup
    val expected_author = "john_doe"
    val expected_subreddit = "scala"
    // execution
    val comment = Comment(
      author = "john_doe",
      content = "Scala is the best",
      controversiality = 0,
      subreddit = "scala",
      subreddit_id = "sr_111",
      post_id = "po_100",
      parent_id = "po_100",
      id = "po_101",
      permalink = "r/scala/po_100/testing_case_classes",
      score = 3
    )
    // validation
    assertEquals(comment.author, expected_author)
    assertEquals(comment.author, expected_author)
    assertEquals(comment.isTopLevel, true)
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
