# python in Spark

# $pyspark

inputFile = sc.textFile("poema.txt")
counts = inputFile.flatMap(lambda line: line.split(" ")).map(lambda word: (word, 1)).reduceByKey(lambda a, b: a + b)
counts.collect()
counts.saveAsTextFile("output-3")
