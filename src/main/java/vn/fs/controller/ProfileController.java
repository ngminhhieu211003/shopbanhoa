package vn.fs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author DongTHD
 *
 */
@Controller
public class ProfileController {

	@GetMapping(value = "/profile")
	public String profile() {
		
		return "web/profile";
	}
}
