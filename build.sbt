name := "bos-proto"

version := "1.0"


// Version of Scala used by the project
scalaVersion := "2.10.4"

// Add dependency on ScalaFX library, for use with JavaFX 2.2/Java 7
libraryDependencies += "org.scalafx" %% "scalafx" % "1.0.0-R8"

// Add dependency on ScalaFX library, for use with JavaFX 8/Java 8
// libraryDependencies += "org.scalafx" %% "scalafx" % "8.0.0-M3"

// Add dependency on JavaFX library (only for Java 7)
unmanagedJars in Compile += Attributed.blank(file(scala.util.Properties.javaHome) / "/lib/jfxrt.jar")

// Fork a new JVM for 'run' and 'test:run', to avoid JavaFX double initialization problems
fork := true