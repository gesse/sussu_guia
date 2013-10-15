import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "play2bars-java-spring"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      javaCore,
      "org.springframework" % "spring-context" % "3.2.1.RELEASE",
      "org.springframework" % "spring-orm" % "3.2.1.RELEASE",
      "org.springframework" % "spring-jdbc" % "3.2.1.RELEASE",
      "org.springframework" % "spring-tx" % "3.2.1.RELEASE",
      "org.springframework" % "spring-test" % "3.2.1.RELEASE" % "test",
      "org.hibernate" % "hibernate-entitymanager" % "4.1.9.Final",
      "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
      //javaJpa,
      //javaJdbc,
      "com.feth" %%  "play-authenticate" % "0.3.4-SNAPSHOT" exclude("org.scala-stm", "scala-stm_2.10.0"),
      "be.objectify" %% "deadbolt-java" % "2.1-RC2" exclude("org.scala-stm", "scala-stm_2.10.0"), 
      "cglib" % "cglib" % "2.2.2"
    )
    
    val playAuthenticate = play.Project(
      "play-authenticate", "1.0-SNAPSHOT", Seq(javaCore), path = file("modules/play-authenticate")
    ).settings(
      libraryDependencies += "org.apache.httpcomponents" % "httpclient" % "4.2" exclude("org.scala-stm", "scala-stm_2.10.0"),
      libraryDependencies += "com.feth" %% "play-easymail" % "0.2-SNAPSHOT" exclude("org.scala-stm", "scala-stm_2.10.0"),
      libraryDependencies += "org.mindrot" % "jbcrypt" % "0.3m" exclude("org.scala-stm", "scala-stm_2.10.0"),
      libraryDependencies += "commons-lang" % "commons-lang" % "2.6" exclude("org.scala-stm", "scala-stm_2.10.0"),

      resolvers += Resolver.url("play-easymail (release)", url("http://joscha.github.com/play-easymail/repo/releases/"))(Resolver.ivyStylePatterns),
      resolvers += Resolver.url("play-easymail (snapshot)", url("http://joscha.github.com/play-easymail/repo/snapshots/"))(Resolver.ivyStylePatterns)
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
      scalaVersion := "2.10.2",
      // Add your own project settings here
		resolvers += Resolver.url("Objectify Play Repository", url("http://schaloner.github.com/releases/"))(Resolver.ivyStylePatterns),
		resolvers += Resolver.url("Objectify Play Snapshot Repository", url("http://schaloner.github.com/snapshots/"))(Resolver.ivyStylePatterns),      
		
		resolvers += Resolver.url("play-easymail (release)", url("http://joscha.github.com/play-easymail/repo/releases/"))(Resolver.ivyStylePatterns),
		resolvers += Resolver.url("play-easymail (snapshot)", url("http://joscha.github.com/play-easymail/repo/snapshots/"))(Resolver.ivyStylePatterns),
		
		resolvers += Resolver.url("play-authenticate (release)", url("http://joscha.github.com/play-authenticate/repo/releases/"))(Resolver.ivyStylePatterns),
		resolvers += Resolver.url("play-authenticate (snapshot)", url("http://joscha.github.com/play-authenticate/repo/snapshots/"))(Resolver.ivyStylePatterns),
		resolvers += "Local Play Repository" at "C:/play-2.2.0/repository/local/"
		
    ).dependsOn(playAuthenticate).aggregate(playAuthenticate)


}
