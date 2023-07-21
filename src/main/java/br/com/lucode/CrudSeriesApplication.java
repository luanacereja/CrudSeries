package br.com.lucode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class CrudSeriesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudSeriesApplication.class, args);
    }

}
