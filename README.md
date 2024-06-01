# Sidecar Example With SpringBoot

* [Sidecar Spring Reference](https://www.baeldung.com/spring-cloud-sidecar-intro)
## Commmands
````bash
#Call node app
curl http://localhost:3000/health
# {status":"UP"}

# spring sidecar: To check the sidecar application, let’s query it for the metadata of the echo service:
#Spring registers a service with the given name “sidecar” in the Eureka Server.
curl http://localhost:8084/hosts/sidecar

#sidecar(8084) show info from echo-app-3(8085)
curl http://localhost:8084/hosts/echo-app-3

#sidecar(8084) show info from node-app(3000)
curl http://localhost:8084/hosts/echo-app-3


````
1. In this tutorial, we’ll learn more about Spring Cloud Sidecar with working examples.
   We will take advantage of Spring Cloud and its ecosystem by using 
Spring Cloud Netflix Sidecar and its useful integrations with Spring Cloud ecossystem.
2. What Is Spring Cloud Sidecar?
   Cloud Netflix Sidecar can be used as a utility to ease the use of service registry for services written in non-JVM languages and improve the interoperability of endpoints within the Spring Cloud ecosystem.

With Cloud Sidecar, a non-JVM service can be registered in the service registry. 
* It can also use service discovery to find other services or even access the config server through host lookup or Zuul Proxy. 
* The only requirement for a non-JVM service to be able to be integrated is having a standard health check endpoint available.

3. Sample Application: 
* Our sample use case consists of 3 applications.  
* To show the best of the Cloud Netflix Sidecar, we’ll create a 
* /hello endpoint in NodeJS and then expose it via a Spring application called sidecar to our ecosystem. 
* Spring Boot application to echo the /hello endpoint responses with the use of service discovery and  Zuul.



With this project, we aim to cover two flows for the request:
* the user calls the echo endpoint on the echo Spring Boot application. 
* The echo endpoint uses DiscoveryClient to look up the hello service URL from Eureka, i.e., the URL pointing to the NodeJS service. 
* Then the echo endpoint calls the hello endpoint on the NodeJS application
the user - calls the hello endpoint directly from the echo application with the help of  *Zuul Proxy*

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.6/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.6/maven-plugin/reference/html/#build-image)
* [Eureka Discovery Client](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#service-discovery-eureka-clients)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.6/reference/htmlsingle/index.html#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

