package com.macro.mall.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ：* @date ：Created in 2020/2/14
 * @version: V1.0
 * @slogan: 时间证明一切
 * @description:
 **/
@ConfigurationProperties(prefix = "redis.key")
@Data
public class RedisKeyPrefixConfig {

    private RedisKeyPrefixConfig.Prefix prefix;

    private RedisKeyPrefixConfig.Expire expire;

    @Data
    public static class Prefix{
        private String otpCode;

    }

    @Data
    public static class Expire{

        private Long otpCode;

    }

}
