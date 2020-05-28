import org.apache.log4j._
import org.apache.spark.sql.SparkSession
object wordCount1 {
  def main(args: Array[String]) {
    Logger.getLogger("org").setLevel(Level.ERROR)
    val session = SparkSession
      .builder
      .master("local[2]")
      .appName("wordCount")
      .getOrCreate()
    val input = session.read.textFile("TheHungerGames.txt")
    import session.implicits._
    val words = input.flatMap(y => y.split(" "))
      .map(x => x.replaceAll("[^a-zA-Z]","").toLowerCase)
    val wordCounts = words.rdd.countByValue()
    val newword = wordCounts.toSeq.sortWith(_._2 > _._2)
    //println(newword(0))
    newword.foreach(println)

  }
}