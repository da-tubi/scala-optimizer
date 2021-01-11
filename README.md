# Improving Scala Optimizer
## Basic
All Scala compiler phases:
```
sbt 'set scalaVersion := "2.13.4"' 'set scalacOptions in ThisBuild ++= Seq("-Ydebug")' clean compile
```
Enable logging for the specific phase(eg. the jvm phase):
```
sbt 'set scalaVersion := "2.13.4"' 'set scalacOptions in ThisBuild ++= Seq("-Ydebug", "-Ylog:jvm")' clean compile
```
Enable logging for the specific phase(eg. the typer phase):
```
sbt 'set scalaVersion := "2.13.4"' 'set scalacOptions in ThisBuild ++= Seq("-Ydebug", "-Ylog:typer")' clean compile
```
javap
```
javap -constants -c -cp target/scala-2.13/classes "Test$"
```

## Customized Scala Compiler
```
 sbt 'set scalaVersion := "2.13.5-bin-SNAPSHOT"' clean compile
```
