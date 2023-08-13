package lab.microservice.greet;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service")
@EnableDiscoveryClient
public interface UserServiceProxy {

    @GetMapping("/users/{id}")
    public UserDTO getUser(@PathVariable Long id);

}
