# testCodespaces
Docker on Codespaces

 ################  uruchamiamy lokalnie
1. mvn -N io.takari:maven:wrapper
2. chmod +x mvnw
3. ./mvnw clean package
4. ./mvnw spring-boot:run

################  uruchamiamy na dockerze
1.  docker-compose down      zatrzymuje apl.
2.	docker container prune -f && docker image prune -a -f && docker volume prune -f   Usuwa stare kontenery , Usuwa stare obrazy , Usuwa stare wolumeny
3.  ./mvnw clean package	                    Buduje czysty JAR

4. jezeli nie ma docker-composer.yml w strukturze:
docker build -t demo-spring-boot .	        Buduje nowy obraz
docker run -p 8080:8080 demo-spring-boot	Startuje czysty kontener

5. jezeli jest docker-composer.yml w strukturze:
docker-compose up --build	        Buduje nowy obraz i Startuje czysty kontener 


