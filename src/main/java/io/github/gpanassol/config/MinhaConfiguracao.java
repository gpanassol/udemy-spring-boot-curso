package io.github.gpanassol.config;

import io.github.gpanassol.DevelopmentConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

//@Configuration
//@Profile("development")
@DevelopmentConfig
public class MinhaConfiguracao {

    @Bean
    public CommandLineRunner executar(){
        return args -> {
          System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
        };
    }
}
