package ir.navaco.mcb.jposgateway;

import org.jpos.q2.Q2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@ComponentScan("ir.navaco.mcb.*")
public class JposGatewayApplication {

    public static void main(String[] args) {
        Q2 server = new Q2();
        server.start();
        SpringApplication.run(JposGatewayApplication.class, args);
    }

}
