package vn.fs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author DongTHD
 *
 */
@Controller
public class AboutController {

	@GetMapping(value = "/gioi-thieu")
	public String about() {
		
		return "web/about";
	}
}
