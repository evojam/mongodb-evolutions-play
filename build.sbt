organization := "com.evojam"

name := "mongodb-evolutions-play"

scalaVersion := "2.11.7"

crossScalaVersions := Seq("2.11.7")

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
