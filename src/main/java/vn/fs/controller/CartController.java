package vn.fs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author DongTHD
 *
 */
@Controller
public class CartController {

	@GetMapping(value = "/thanh-toan")
	public String checkOut() {
		
		return "web/shoppingCart_checkout";
	}
}
