package com.projeto;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public GroupedOpenApi booksApi() {
        return GroupedOpenApi.builder()
                .group("Book")
                .pathsToMatch("/Book/**")
                .build();
    }
}
