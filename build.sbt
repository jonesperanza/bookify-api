name := """bookify-api"""
organization := "bookify"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.8"

libraryDependencies += guice
libraryDependencies ++= Seq(
    // Enable reactive mongo for Play 2.8
    "org.reactivemongo" %% "play2-reactivemongo" % "0.20.13-play28",
    // Provide JSON serialization for reactive mongo  
    "org.reactivemongo" %% "reactivemongo-play-json-compat" % "1.0.1-play28",
    // Provide BSON serialization for reactive mongo  
    "org.reactivemongo" %% "reactivemongo-bson-compat" % "0.20.13",
    // Provide JSON serialization for Joda-Time
    "com.typesafe.play" %% "play-json-joda" % "2.7.4",
)
libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "2.9.0"
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "bookify.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "bookify.binders._"
