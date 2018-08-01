import org.apache.spark.sql.SparkSession

object Test  {
  def main(args: Array[String]): Unit = {
    val sparkSession =
    //  SparkSession.builder().getOrCreate()
     SparkSession
      .builder()
      .appName("ExampleProgam")
      .config("spark.master", "local")
      .getOrCreate();

    import org.apache.spark.SparkConf
    import sparkSession.implicits._
    val text = sparkSession.read.textFile("mytextfile.txt")
    val counts = text.flatMap(line => line.split(" "))
      .map(word => (word,1))

    counts.show(false)
  }
}