//scala in Spark

// $spark-shell --master "local[4]"
// localhost:4040

val inputFile = sc.textFile("test.txt")
val counts = inputFile.flatMap(line => line.split(" ")).map(word => (word, 1)).reduceByKey(_ + _)
counts.toDebugString
counts.saveAsTextFile("output")
val repartitioned = counts.repartition(5)
repartitioned.toDebugString
repartitioned.saveAsTextFile("output-2")
