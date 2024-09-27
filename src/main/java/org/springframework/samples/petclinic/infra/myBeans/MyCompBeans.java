package org.springframework.samples.petclinic.infra.myBeans;

import org.springframework.stereotype.Component;

@Component
public class MyCompBeans {
	public String myName() {
        return "myName";
    }
}
