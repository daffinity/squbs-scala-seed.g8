
name := "$appname;format="norm"$"

version := "$version$"

organization in ThisBuild := "$organization$.$project;format="norm"$"

scalaVersion := "$scala_version$"

crossPaths := false

resolvers += Resolver.sonatypeRepo("snapshots")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-encoding", "utf8", "-language:postfixOps")

import Versions._

Revolver.settings

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % Versions.logbackClassicV,
  "org.squbs" %% "squbs-unicomplex" % Versions.squbsV,
  "org.squbs" %% "squbs-actormonitor" % Versions.squbsV,
  "org.squbs" %% "squbs-actorregistry" % Versions.squbsV,
  "org.squbs" %% "squbs-httpclient" % Versions.squbsV,
  "org.squbs" %% "squbs-admin" % Versions.squbsV,
  "org.json4s" %% "json4s-native" %  Versions.json4sV,
  "de.heikoseeberger" %% "akka-http-json4s" % Versions.akkaHttpJson4sV,
  "org.squbs" %% "squbs-testkit" % Versions.squbsV % Test,
  "com.typesafe.akka" %% "akka-http-testkit" % Versions.akkaHttpV % Test
)

mainClass in (Compile, run) := Some("org.squbs.unicomplex.Bootstrap")

// enable scalastyle on compile
lazy val compileScalastyle = taskKey[Unit]("compileScalastyle")

compileScalastyle := scalastyle.in(Compile).toTask("").value

(compile in Compile) := ((compile in Compile) dependsOn compileScalastyle).value

coverageMinimum := 100

coverageFailOnMinimum := true

lazy val root = (project in file(".")).enablePlugins(JavaAppPackaging, AshScriptPlugin)
     .settings(  dockerBaseImage := "openjdk:8-jre-alpine" )