package vn.fs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author DongTHD
 *
 */
@Controller
public class ShopController extends CommomController{

	@GetMapping(value = "/products")
	public String shop() {
		
		return "web/shop";
	}
}
