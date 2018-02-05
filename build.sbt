
name := "ScalaSlickDB"

version := "1.0"

scalaVersion := "2.11.8"

resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(

  "com.typesafe.slick" %% "slick" % "3.0.0"
)
