# Improving Scala Optimizer
## Basic
All Scala compiler phases:
```
sbt 'set scalaVersion := "2.13.4"' 'set scalacOptions in ThisBuild ++= Seq("-Ydebug")' compile
```
Enable logging for the specific phase:
```
sbt 'set scalaVersion := "2.13.4"' 'set scalacOptions in ThisBuild ++= Seq("-Ydebug", "-Ylog:jvm")' compile
```
