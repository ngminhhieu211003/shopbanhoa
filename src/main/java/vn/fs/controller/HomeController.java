package vn.fs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import vn.fs.entities.Product;
import vn.fs.repository.ProductRepository;

/**
 * @author DongTHD
 *
 */
@Controller
public class HomeController extends CommomController {
	
	@Autowired
	ProductRepository productRepository;

	@GetMapping(value = "/")
	public String home() {

		return "web/home";
	}
	
	// list product ở trang chủ limit 10 sản phẩm mới nhất
	@ModelAttribute("listProduct10")
	public List<Product> listproduct10(Model model) {
		List<Product> productList = productRepository.listProductNew20();
		model.addAttribute("productList", productList);
		return productList;
	}

}
