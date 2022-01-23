package vn.fs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {

	@GetMapping(value = "/san-pham")
	public String shop() {
		
		return "web/shop";
	}
}
