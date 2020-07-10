package com.sooriya;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//java code configuration instead of xml configuration 
@Configuration
@ComponentScan("com.sooriya")   // to scan classes
@PropertySource("classpath:sport.properties")   // to retrieve values from property file
public class SportConfig {

}
