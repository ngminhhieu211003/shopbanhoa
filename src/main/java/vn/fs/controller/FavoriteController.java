package vn.fs.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.fs.commom.CommomDataService;
import vn.fs.entities.Favorite;
import vn.fs.entities.Product;
import vn.fs.entities.User;
import vn.fs.repository.FavoriteRepository;
import vn.fs.repository.ProductRepository;

/**
 * @author DongTHD
 *
 */
@Controller
public class FavoriteController extends CommomController {

	@Autowired
	FavoriteRepository favoriteRepository;

	@Autowired
	ProductRepository productRepository;

	@Autowired
	CommomDataService commomDataService;

	@GetMapping(value = "/favorite")
	public String favorite(Model model, User user) {
		List<Favorite> favorites = favoriteRepository.selectAllSaves(user.getUserId());
		commomDataService.commonData(model, user);
		model.addAttribute("favorites", favorites);
		return "web/favorite";
	}

	@GetMapping(value = "/doFavorite")
	@ResponseBody
	public Map<String, String> doFavorite(Model model, Favorite favorite, User user, @RequestParam("id") Long id) {
		Map<String, String> data = new LinkedHashMap<>();
		Product product = productRepository.getById(id);
		favorite.setProduct(product);
		favorite.setUser(user);
		favoriteRepository.save(favorite);
		commomDataService.commonData(model, user);
		data.put("success", "add favorite ok");
		return data;
	}

	@GetMapping(value = "/doUnFavorite")
	@ResponseBody
	public Map<String, String> doUnFavorite(Model model, User user, @RequestParam("id") Long productId) {
		Map<String, String> data = new LinkedHashMap<>();
		Favorite favorite = favoriteRepository.selectSaves(productId, user.getUserId());
		favoriteRepository.delete(favorite);
		commomDataService.commonData(model, user);
		data.put("success", "add favorite ok");
		return data;
	}
}
