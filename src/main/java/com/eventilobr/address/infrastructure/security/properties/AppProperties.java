package com.eventilobr.address.infrastructure.security.properties;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties("app")
@Data
@NoArgsConstructor
public class AppProperties {

    private Map<String, String> securityIgnore;
    private List<String> allowedServers;

}
