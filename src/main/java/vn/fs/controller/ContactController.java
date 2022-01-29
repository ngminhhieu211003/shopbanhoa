package vn.fs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author DongTHD
 *
 */
@Controller
public class ContactController extends CommomController{

	@GetMapping(value = "/contact")
	public String contact() {
		
		return "web/contact";
	}
}
