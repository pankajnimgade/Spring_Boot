package test101.stock.viewer.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created on 4/6/2018
 *
 * @author Pankaj Nimgade
 */
@EnableJpaRepositories(basePackages = "test101.stock.viewer.application.repository")
@SpringBootApplication
public class StockViewerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockViewerApplication.class, args);
    }
}
