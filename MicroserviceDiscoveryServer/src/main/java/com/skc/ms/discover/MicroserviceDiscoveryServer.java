/**
 * 
 */
package com.skc.ms.discover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author sitakant
 *
 */

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceDiscoveryServer {
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDiscoveryServer.class, args);
	}
}
