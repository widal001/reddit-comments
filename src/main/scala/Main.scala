package reddit

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext.*
import org.apache.spark.rdd.RDD

import org.apache.log4j.{Logger, Level}

@main def get_rdd: RDD[Int] =
  // Reduce Spark logging verbosity
  Logger.getLogger("org.apache.spark").setLevel(Level.ERROR)

  // Configure spark instance
  val name: String = "RedditComments"
  val conf: SparkConf = new SparkConf().setAppName(name).setMaster("local[1]")
  val sc: SparkContext = SparkContext.getOrCreate(conf)

  // Return a simple RDD
  val input_list = List(1, 2, 3)
  sc.parallelize(input_list)

def msg = "I was compiled by Scala 3. :)"
