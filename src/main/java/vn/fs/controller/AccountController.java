package vn.fs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author DongTHD
 *
 */
@Controller
public class AccountController {

	@GetMapping(value = "/doi-mat-khau")
	public String changePassword() {
		
		return "web/changePassword";
	}
	
	@GetMapping(value = "/quen-mat-khau")
	public String forgotPassword() {
		
		return "web/forgotPassword";
	}
	
}
