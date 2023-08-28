package com.docker.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	@GetMapping(value="/getMsg")
	public String msg() {
		return "Hi";
	}

}
