package com.example.msadmink8s;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableDiscoveryClient
@EnableScheduling
@EnableAdminServer
@SpringBootApplication
public class MsAdminK8sApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsAdminK8sApplication.class, args);
    }

}
