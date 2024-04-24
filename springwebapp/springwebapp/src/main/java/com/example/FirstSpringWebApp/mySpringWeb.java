package com.example.FirstSpringWebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mySpringWeb {
	
	@GetMapping()
	public String welcome() {
		return "<!doctpye> <html>"+"<h1>"+"Home Page--> <a href='https://www.google.com'>"+"Google"+"</a>"+"</h1>"+"</html>";
	}
	
	@GetMapping("search")
	public String sayHello() {
		return "<html>"+"<h1>"+"Hello Shivshankar, this is your first REST API. Knowing, this thing i'm glad.!"+"</h1>"+"</html>";
	}
	
	@GetMapping("searching")
	public String find(@RequestParam(name = "q")String value) {
		return "<html>"+"<h1>"+value+"<br>"+"Hello Shivshankar, this is your first REST API. Knowing, this thing i'm glad.!"+"</h1>"+"</html>";
	}
	
	@GetMapping("find/{q}")
	public String search(@PathVariable(name="q")String value) {
		return value;
	}
	
	@GetMapping("searching/{s}")
	public String searchSomthing(@PathVariable(name="s") String value) {
		return "<html>"+"<h2>"+" Here is Your Searched Query: "+"</br>"+value+"</h2>"+"<br><br><br>"+"<h1>"+"Here is your Searched Query: "+"</br>"+value+"</h1>"+"</html>";
		
	}
}
