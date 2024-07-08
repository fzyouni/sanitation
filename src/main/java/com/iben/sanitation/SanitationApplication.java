package com.iben.sanitation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SanitationApplication {

  public static void main(String[] args) {
    SpringApplication.run(SanitationApplication.class, args);
  }

}
