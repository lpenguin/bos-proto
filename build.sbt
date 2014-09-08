name := "bos-proto"
version := "1.0"
unmanagedJars in Compile +=
  Attributed.blank(
    file(scala.util.Properties.javaHome) / "/lib/jfxrt.jar")
libraryDependencies += "org.scalafx" %% "scalafx" % "2.2.67-R11-SNAPSHOT"