package br.com.lucode.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
//@EntityScan(basePackages = {"br/com/lucode/app/entity", "br/com/lucode/app/web"})
public class CrudSeriesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudSeriesApplication.class, args);
    }

}
