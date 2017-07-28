/**
 * 
 */
package com.skc.ms.web.repo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;


/**
 * @author chaudhsi
 *
 */
@Repository
public class RemoteAccountRepository {

	@Autowired
	protected RestTemplate restTemplate;

	protected String serviceUrl;

	@Autowired
	private DiscoveryClient discoveryClient;

	public Account getAccountDetails() {
		
		 discoveryClient.getInstances("test-account").forEach((ServiceInstance s) -> {
	            System.out.println(ToStringBuilder.reflectionToString(s));
	        });
		
		System.out.println(discoveryClient.getInstances("test-account").get(0).getUri());
		return restTemplate.getForObject("http://test-account"+"/service/account", Account.class);
	}
}
