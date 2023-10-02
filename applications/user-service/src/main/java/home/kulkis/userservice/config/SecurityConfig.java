package home.kulkis.userservice.config;

import home.kulkis.userservice.security.SecureUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private SecureUserService secureUserService;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable()
                .authorizeRequests()
                .anyRequest().permitAll()
                .and()
                .formLogin().permitAll()
                .and()
                .oauth2Login()
                .userInfoEndpoint()
                .userService(secureUserService);
//        temporary config for dev process:
//        - cors and csrf should be changed
//        - google login page http://localhost:8701/login/oauth2/code/google
//        - no my login page - need to create
//        TODO: ENABLE normal security when 2 services will be imlemented
//        https://www.codejava.net/frameworks/spring-boot/oauth2-login-with-google-example
//        next step 8
        return http.build();
    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

}
