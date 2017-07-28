# Java-Microservices

- Make sure that , mssd.sitakant.com should be there in /etc/hosts file
- First Run the MicroserviceDiscoveryServer.java class of MicroserviceDiscoveryServer Module
- Now you can see the Discovery dashboard (http://mssd.sitakant.com:8761)
- Run the AppAccount.java class of MicroservicesAccountService Module Which will register in the Discovery Server as well it will expose the service
- Run AppWeb.java class of MicroservicesWebClient Module 
- Now, you can access the below URL 
   http://mssd.sitakant.com:4323/
  
  
## Flow
- When we will execute http://mssd.sitakant.com:4323/ URL, it will get the test-account service URL from the service discovery module and give a request to web clint






### Happy Learning
