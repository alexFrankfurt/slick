libraryDependencies ++= List(
  "com.novocode" % "junit-interface" % "0.11" % Test,
  "ch.qos.logback" % "logback-classic" % "1.2.3" % Test,
  "org.postgresql" % "postgresql" % "42.2.22" % Test,
  "com.typesafe.slick" %% "slick" % "3.2.3",
  "com.typesafe.slick" %% "slick-testkit" % "3.2.3" % Test
)
scalaVersion := "2.12.14"
scalacOptions += "-deprecation"

Test / parallelExecution := false

logBuffered := false

run / fork := true

testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v", "-s", "-a")
