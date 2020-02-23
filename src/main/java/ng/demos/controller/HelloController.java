package ng.demos.controller;

import ng.demos.repository.HelloEntity;
import ng.demos.repository.HelloJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
	
	@Autowired
	private HelloJpaRepository helloJpaRepository;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello, Spring.";
	}
	
	@GetMapping("/hey")
	public List<HelloEntity> hey() {
		return helloJpaRepository.findAll();
	}
}
