package com.silva.echoapp3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class EchoController {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/hello/{me}")
    public ResponseEntity<String> echo(@PathVariable("me") String me) {
        final List<ServiceInstance> instances = discoveryClient.getInstances("sidecar");
        if (instances.isEmpty()) {
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("hello service is down");
        }
        final ServiceInstance serviceInstance = instances.get(0);
        return ResponseEntity.ok(restTemplate.getForObject(serviceInstance.getUri().toString() + "/hello/" + me, String.class));
    }

}
