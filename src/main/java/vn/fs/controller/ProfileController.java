package vn.fs.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

	@GetMapping(value = "/profile")
	public String profile(Model model, Principal principal) {

		if (principal != null) {

			model.addAttribute("user", new User());
			User user = userRepository.findByEmail(principal.getName());
			model.addAttribute("user", user);
		}

		return "web/profile";
	}

}
