# sb-camel-rabbitmq-kafka
Spring Boot app with camel routes. It consuming message from rabbitmq that trigger a call to http rest endpoint and get data and produce message to kafka


Setup on Mac OS:
1) install rabbitmq:
brew install rabbitmq
brew services start rabbitmq
brew services stop rabbitmq

2)Setup a mock rest service:
downloaded the standalone JAR and copy in directory somewhere. (example :  mywiremock)
http://repo1.maven.org/maven2/com/github/tomakehurst/wiremock-standalone/2.23.2/wiremock-standalone-2.23.2.jar
java -jar wiremock-standalone-2.23.2.jar --port 9999
put test.json  mywiremock/mappings
