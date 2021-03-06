package com.greg;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@Value("${env}")
	private String env;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("env", this.env);
		return "welcome";
	}

}