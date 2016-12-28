organization := "com.evojam"

name := "mongodb-evolutions-play"

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.11.8")

scalacOptions ++= Seq(
  "-target:jvm-1.7",
  "-encoding", "UTF-8",
  "-deprecation",
  "-feature",
  "-unchecked",
  "-Xlint",
  "-Ywarn-adapted-args",
  "-Ywarn-value-discard",
  "-Ywarn-inaccessible",
  "-Ywarn-dead-code"
)

licenses +=("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))

resolvers ++= Seq(
  Resolver.sbtPluginRepo("snapshots"),
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases"),
  Resolver.typesafeRepo("releases")
)

libraryDependencies ++= Seq(
  "com.evojam" %% "mongodb-evolutions-scala" % "0.2.3-SNAPSHOT",
  "com.typesafe.play" %% "play" % "2.4.8"
)
