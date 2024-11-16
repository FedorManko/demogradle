package com.example.demo.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class OpenApiConfiguration {

    @Bean
    public OpenAPI baseOpenApi(BuildProperties buildProperties) {

        final Info openapiInfo = new Info()
            .title(buildProperties.getName())
            .version(buildProperties.getVersion())
            .description("FOKA");

        return new OpenAPI().info(openapiInfo);
    }
}
