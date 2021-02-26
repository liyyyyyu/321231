package com.macro.mall.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ：* @date ：Created in 2020/2/15
 * @version: V1.0
 * @slogan: 时间证明一切
 * @description:
 **/
@Data
@ConfigurationProperties(prefix = "jwt")
@Component
public class JwtProperties {

    private String tokenHeader;

    private String secret;

    private Long expiration;

    private String tokenHead;
}
