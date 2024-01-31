package in.ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelComeRestController {

	@GetMapping("/")
	public String getMsg() {
		return "Welcome to My First Spring Boot Web App! this is my SB App";
	}
	
}
