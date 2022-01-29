package vn.fs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author DongTHD
 *
 */
@Controller
public class HomeController extends CommomController {

	@GetMapping(value = "/")
	public String home() {

		return "web/home";
	}

}
