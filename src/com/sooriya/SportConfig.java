package com.sooriya;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.sooriya")
@PropertySource("classpath:sport.properties")
public class SportConfig {

}
