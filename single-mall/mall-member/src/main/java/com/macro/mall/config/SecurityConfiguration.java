package com.macro.mall.config;

import com.macro.mall.util.JwtKit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author ：* @date ：Created in 2020/2/14
 * @version: V1.0
 * @slogan: 时间证明一切
 * @description:
 **/
@Configuration
public class SecurityConfiguration {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public JwtKit jwtKit(){
        return new JwtKit();
    }

}
