package pl.bykowski.springbootswaggerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class SpringbootSwaggerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSwaggerExampleApplication.class, args);
    }

    @Bean
    public Docket get() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/api/**"))
                .apis(RequestHandlerSelectors.basePackage("pl.bykowski.springbootswaggerexample"))
                .build().apiInfo(createApiInfo());
    }

    private ApiInfo createApiInfo() {
        return new ApiInfo("Stundes API",
                "Students database",
                "1.00",
                "http://bykowski.pl",
                new Contact("Przemek", "http://bykowski.pl", "przemek@bykowski.pl"),
                "my own licence",
                "http://bykowski.pl",
                Collections.emptyList()
        );
    }


}
