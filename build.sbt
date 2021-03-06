name := "spark_cassandra"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
                      "org.apache.spark" %% "spark-core" % "1.2.0",
					"com.datastax.spark" %% "spark-cassandra-connector" % "1.1.0"
                    )
