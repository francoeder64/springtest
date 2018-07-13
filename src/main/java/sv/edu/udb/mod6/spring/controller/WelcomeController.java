package sv.edu.udb.mod6.spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sv.edu.udb.mod6.spring.bean.HelloWorldService;

@Controller
public class WelcomeController {
	
	private final HelloWorldService helloWorldService;
	
	@Autowired
	public WelcomeController(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Map<String, Object> model) {
		model.put("title", helloWorldService.getTitle(""));
		model.put("msg", helloWorldService.getDesc());
		return "index";
	}

}
