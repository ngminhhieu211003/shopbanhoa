package vn.fs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author DongTHD
 *
 */
@Controller
public class LoginController {

	@GetMapping(value = "/dang-nhap")
	public String login() {
		
		return "web/login";
	}
}
