package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private Environment environment;

    @Test
    void contextLoads() {
        assertThat(environment.getProperty("spring.application.name"))
                .isEqualTo("demo");
    }

}
