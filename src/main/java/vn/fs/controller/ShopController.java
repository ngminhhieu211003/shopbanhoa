package vn.fs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vn.fs.entities.Product;
import vn.fs.repository.ProductRepository;

/**
 * @author DongTHD
 *
 */
@Controller
public class ShopController extends CommomController {

	@Autowired
	ProductRepository productRepository;

	@GetMapping(value = "/products")
	public String shop(Model model) {
		List<Product> products = productRepository.findAll();
		model.addAttribute("products", products);
		return "web/shop";
	}
}
