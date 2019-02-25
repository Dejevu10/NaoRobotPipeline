package de.naorobot.pipeline;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryView {
	
	@RequestMapping("/")
	public String sayHello() {
		return "<h1> Hello! </h1>";
	}

}
