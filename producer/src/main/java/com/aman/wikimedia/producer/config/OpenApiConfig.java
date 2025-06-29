package com.aman.wikimedia.producer.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info = @Info(
        contact = @Contact(
            name = "Amanuel",
            email = "amanueltemesgen62@gmail.com",
            url="https://aman"
        ),
        description = " open api documentation for spring security",
        title = "open api specification- Aman",
        version = "1.0",
        license = @License(
            name = "Licence name",
            url = "https://nothing-todo.com"
        ) ,
        termsOfService = " Terms of service" 
    ),
    servers = {
        @Server(
            description = "Local ENV",
            url = "http://localhost:8088/api/v1"
        ),
        @Server(
            description = "TEST ENV",
            url = "http://10.48.19.33:8088/api/v1"
        )
    }
)

public class OpenApiConfig {
    
}
