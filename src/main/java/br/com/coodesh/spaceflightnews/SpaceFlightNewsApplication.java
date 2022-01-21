package br.com.coodesh.spaceflightnews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpaceFlightNewsApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpaceFlightNewsApplication.class, args);
  }
}
