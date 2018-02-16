package com.iqmsoft.vaadin;

import java.time.LocalDateTime;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class Greeter {
    public String greet() {
        return "WildFly Swarm Vaadin Howdy at " + LocalDateTime.now();
    }
}
