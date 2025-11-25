package com.example.tripmate_gateway_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class GatewaySecurityConfig {
    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity serverHttpSecurity) throws Exception{
        serverHttpSecurity
                            .csrf(csrf -> csrf.disable())
                            .cors(cors -> cors.disable())
                            .authorizeExchange(exchange -> exchange
                            .pathMatchers("/api/v1/auth/login","/api/v1/auth/register","/actuator/health").permitAll().anyExchange().authenticated());
        return serverHttpSecurity.build();

    }
}
