package vn.fs.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vn.fs.commom.CommomDataService;
import vn.fs.entities.User;
import vn.fs.repository.UserRepository;

/**
 * @author DongTHD
 *
 */
@Controller
public class ProfileController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	CommomDataService commomDataService;

	@GetMapping(value = "/profile")
	public String profile(Model model, Principal principal, User user) {

		if (principal != null) {

			model.addAttribute("user", new User());
			user = userRepository.findByEmail(principal.getName());
			model.addAttribute("user", user);
		}
		
		commomDataService.commonData(model, user);

		return "web/profile";
	}

}
