name := """$name$"""

version := """$version$"""

scalaVersion := """$scala_version$"""

// Move scala style to the project folder so IntelliJ picks it up
scalastyleConfig := baseDirectory.value / "project" / "scalastyle_config.xml"
(scalastyleConfig in Test) := baseDirectory.value / "project" / "scalastyle_test_config.xml"
scalastyleFailOnError := true

libraryDependencies ++= Seq(
  "com.iheart" %% "ficus" % "$ficus_version$",
  "com.github.scopt" %% "scopt" % "$scopt_version$",
  "org.scalatest" %% "scalatest" % "$scalatest_version$" % "test"
)
