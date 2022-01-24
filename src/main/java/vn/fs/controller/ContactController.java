package vn.fs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author DongTHD
 *
 */
@Controller
public class ContactController {

	@GetMapping(value = "/lien-he")
	public String contact() {
		
		return "web/contact";
	}
}
