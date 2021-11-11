package com.codeline.tec.checked;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CheckedController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
}
