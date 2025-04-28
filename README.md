# testCodespaces
Docker on Codespaces

 ################  uruchamiamy lokalnie
1. mvn -N io.takari:maven:wrapper
2. chmod +x mvnw
3. ./mvnw clean package
4. ./mvnw spring-boot:run

################  uruchamiamy na dockerze
1. ./mvnw clean package
2. docker build -t demo-spring-boot .
3. docker run -p 8080:8080 demo-spring-boot


