package com.macro.mall.config;

import com.macro.mall.config.properties.NoAuthUrlProperties;
import com.macro.mall.interceptor.AuthInterceptorHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import java.util.ArrayList;

/**
 * @author ：* @date ：Created in 2020/2/15
 * @version: V1.0
 * @slogan: 时间证明一切
 * @description:
 **/
@EnableConfigurationProperties(NoAuthUrlProperties.class)
@Configuration
public class IntercepterConfiguration implements WebMvcConfigurer {

    @Autowired
    private NoAuthUrlProperties noAuthUrlProperties;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器
        registry.addInterceptor(authInterceptorHandler())
                .addPathPatterns("/**")
                .excludePathPatterns(new ArrayList<>(noAuthUrlProperties.getShouldSkipUrls()));
    }

    @Bean
    public AuthInterceptorHandler authInterceptorHandler(){
        return new AuthInterceptorHandler();
    }
}
