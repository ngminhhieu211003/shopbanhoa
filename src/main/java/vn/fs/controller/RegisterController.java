package vn.fs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author DongTHD
 *
 */
@Controller
public class RegisterController {

	@GetMapping(value = "/dang-ky")
	public String register() {
		
		return "web/register";
	}
}
