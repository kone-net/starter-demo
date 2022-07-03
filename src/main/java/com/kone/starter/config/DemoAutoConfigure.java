package com.kone.starter.config;

import com.kone.starter.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kone
 * @date 2022/6/30
 */
@Configuration
@ConditionalOnClass(DemoService.class)
@EnableConfigurationProperties(DemoConfigProps.class)
public class DemoAutoConfigure {

    private final DemoConfigProps props;

    @Autowired
    public DemoAutoConfigure(DemoConfigProps props) {
        this.props = props;
    }

    @Bean
    @ConditionalOnMissingBean(DemoService.class)
    @ConditionalOnProperty(prefix = "demo",value = "enabled", havingValue = "true")
    public DemoService demoService() {
        return new DemoService(props);
    }
}
