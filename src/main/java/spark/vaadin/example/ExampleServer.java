package spark.vaadin.example;

import lombok.SneakyThrows;
import spark.Service;
import spark.vaadin.VaadinSparkService;

public class ExampleServer {

  @SneakyThrows
  public static void main(String[] args) {
    Service service1 = Service.ignite();
    service1.port(8081);
    service1.get("/api/hello", (req1, res1) -> "Hello World");
    service1.get("/api/:part1/:part2", (req2, res2) -> "Hello World");

    Service service = VaadinSparkService.ignite();
    service.port(8080);
    service.get("/api/hello", (req1, res1) -> "Hello World");
    service.get("/api/:part1/:part2", (req2, res2) -> "Hello World");

    Service service2 = Service.ignite();
    service2.port(8082);
    service2.get("/api/hello", (req1, res1) -> "Hello World");
    service2.get("/api/:part1/:part2", (req2, res2) -> "Hello World");

  }

}
