name := "akka-java-seed"

version := "15v01p01"

libraryDependencies ++= Seq(
  TypesafeLibrary.akkaActor.value,
  TypesafeLibrary.akkaTestkit.value % "test",
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test")
  