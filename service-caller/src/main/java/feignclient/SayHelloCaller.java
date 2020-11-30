package feignclient;

import org.springframework.web.bind.annotation.RequestMapping;

public interface SayHelloCaller {

    @RequestMapping("/hello")
    public String sayHello();
}
