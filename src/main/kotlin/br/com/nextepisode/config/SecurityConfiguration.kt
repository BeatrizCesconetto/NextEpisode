package br.com.nextepisode.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .csrf { it.disable() }  // Updated CSRF disable syntax
            .authorizeHttpRequests { authz ->
                authz
                    .requestMatchers("/users/**").permitAll()
                    .anyRequest().authenticated()
            }
        return http.build()
    }
}