/**
 * 
 */
package com.skc.ms.account.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author sitakant
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.skc")
public class AppAccount {

	public static void main(String[] args) {
		SpringApplication.run(AppAccount.class, args);
	}
}
