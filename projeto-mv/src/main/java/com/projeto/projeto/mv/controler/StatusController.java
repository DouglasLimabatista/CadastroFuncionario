package com.projeto.projeto.mv.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StatusController {
	
	@RequestMapping(path ="/api/status")
	public String index(){
		return "index";
		
	}

}
