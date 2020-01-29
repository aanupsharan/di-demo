package anup.springframework.didemo.controllers;

import anup.springframework.didemo.services.GreetingService;

public class ControllerInjectedController {
    private GreetingService greetingService;

    public ControllerInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
