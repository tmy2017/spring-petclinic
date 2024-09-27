package org.springframework.samples.petclinic.infra.myBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.rmi.server.LogStream.log;

@Configuration
public class Aloha {
	@Bean
	public String thisIsMyName() {
		String result = "something is more than nothing";
		log("adding something");
		result = result.repeat(2);
		return result;
	}
}
