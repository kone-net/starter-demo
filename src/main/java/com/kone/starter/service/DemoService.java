package com.kone.starter.service;

import com.kone.starter.config.DemoConfigProps;

/**
 * @author Kone
 * @date 2022/6/30
 */
public class DemoService {
    private final DemoConfigProps props;

    public DemoService(DemoConfigProps props) {
        this.props = props;
    }

    public void print() {
        System.out.println(props);
    }
}
