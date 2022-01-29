package vn.fs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author DongTHD
 *
 */
@Controller
public class AboutController extends CommomController{

	@GetMapping(value = "/aboutUs")
	public String about() {
		
		return "web/about";
	}
}
