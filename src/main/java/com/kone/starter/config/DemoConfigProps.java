package com.kone.starter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Kone
 * @date 2022/6/30
 */
@ConfigurationProperties("demo")
public class DemoConfigProps {
    private String host;
    private Integer port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "DemoConfigProps{" +
                "host='" + host + '\'' +
                ", port=" + port +
                '}';
    }
}
