package vn.fs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author DongTHD
 *
 */
@Controller
public class FavoriteController {

	@GetMapping(value = "/yeu-thich")
	public String favorite() {
		
		return "web/favorite";
	}
}
