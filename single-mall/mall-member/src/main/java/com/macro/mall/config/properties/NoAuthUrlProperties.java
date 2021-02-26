package com.macro.mall.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;

/**
 * @author ：* @date ：Created in 2020/2/14
 * @version: V1.0
 * @slogan: 时间证明一切
 * @description:
 **/
@Data
@ConfigurationProperties(prefix = "member.auth")
public class NoAuthUrlProperties {
    private LinkedHashSet<String> shouldSkipUrls;
}
