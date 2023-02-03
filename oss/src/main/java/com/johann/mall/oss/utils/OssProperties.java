package com.johann.mall.oss.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix="aliyun.oss")
public class OssProperties {
    private String accessKey;
    private String secretKey;
    private String endpoint;
    private String bucketName;
}
