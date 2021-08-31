package pe.ueat.convert.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
public class Swagger2Config {

    @Bean
    public Docket infoApiAvailabilityHub() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Convert")
                .apiInfo(apiInfo())
                .select()
                .paths(regex("/v1.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API REST services")
                .description("Especificacion de REST API services")
                .termsOfServiceUrl("Terminos de Servicio")
                .contact(new Contact("Axel Cristhofer Gonzales Llerena",
                		"http://cv-app-axel.s3-website.us-east-2.amazonaws.com/",
                		"ac.gonzalesllerena@gmail.com"))
                .license("UEAT")
                .version("1.0")
                .build();
    }
    

 
}