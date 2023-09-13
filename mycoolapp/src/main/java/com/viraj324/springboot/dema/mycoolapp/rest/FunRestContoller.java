package com.viraj324.springboot.dema.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestContoller {
	//expose "/" that return "Hello World"
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World..!"; 
	}
	
	
	
	
	@GetMapping("/workout")
	public String workout() {
		return ("Try to workout...!");
	}
	
	//Inject properties for: coach.name and team.name
	@Value("${coach.name}")
	private String coachName;
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach" + coachName +" ,Team name : "+teamName;
	}
	
	
}
