package br.com.dr.funcionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class FuncionarioApplication {

    public static void main(String[] args) {
        SpringApplication.run(FuncionarioApplication.class, args);
    }

    @Bean
    public Docket configSwagger() {
        return new Docket(DocumentationType.SWAGGER_2).select()
            .apis(
                RequestHandlerSelectors.basePackage(
                    "br.com.dr.funcionario")).build();
    }
}
