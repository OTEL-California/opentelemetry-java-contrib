plugins {
  id("otel.java-conventions")

  war
}

description = "JMX metrics scraper - test web application"

dependencies {
  compileOnly("jakarta.servlet:jakarta.servlet-api:5.0.0")
}
