package com.example.msauth.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ms-user", url = "${client.ms-user.endpoint}")
public interface UserClient {
    @GetMapping("api/users/name")
    Long getUserId(@RequestParam String username);
}
