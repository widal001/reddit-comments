package reddit

object Aliases {
  type Id = String
  type Username = String
}
import Aliases._ // Allows type aliases to be accessed directly

case class Comment(
    author: Username, // Username of the author
    content: String, // Content of the comment
    controversiality: Int,
    subreddit: String, // Name of subreddit in which the comment was posted
    subreddit_id: Id, // Id of subreddit in which the comment was posted
    post_id: Id, // Id of post on which comment was posted
    parent_id: Id, // Id of comment under which this comment was posted
    id: Id, // Id of the comment
    permalink: String, // Link to comment
    score: Int // Summation of upvotes and downvotes on comment
) {
  def isTopLevel: Boolean = this.post_id == this.parent_id
}
