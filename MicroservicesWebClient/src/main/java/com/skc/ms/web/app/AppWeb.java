/**
 * 
 */
package com.skc.ms.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * @author chaudhsi
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.skc")
public class AppWeb {

	
	public static void main(String[] args) {
		SpringApplication.run(AppWeb.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
