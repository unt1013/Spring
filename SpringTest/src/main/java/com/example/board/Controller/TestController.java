package com.example.board.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class TestController {
	@GetMapping("/TestTest")
	public String welcome(Model model) {
		RestTemplate rt = new RestTemplate();
		Map<String, Object> map = rt.getForObject("http://ggoreb.com/m/exam.jsp", Map.class);
		
		
		model.addAttribute("Data", map);
		
		return "TestTest";
	}
}