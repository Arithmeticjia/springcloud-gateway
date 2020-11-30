package controller;

import feignclient.SayHelloCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class Person {

    @Autowired
    private SayHelloCaller caller;
    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
        return caller.sayHello();
    }
}
