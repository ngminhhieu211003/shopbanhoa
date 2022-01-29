package vn.fs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author DongTHD
 *
 */
@Controller
public class CartController extends CommomController{

	@GetMapping(value = "/shoppingCart_checkout")
	public String checkOut() {
		
		return "web/shoppingCart_checkout";
	}
}
