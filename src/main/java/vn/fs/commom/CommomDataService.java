package vn.fs.commom;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import vn.fs.entities.CartItem;
import vn.fs.entities.User;
import vn.fs.repository.FavoriteRepository;
import vn.fs.service.ShoppingCartService;

@Service
public class CommomDataService {
	
	@Autowired
	FavoriteRepository favoriteRepository;
	
	@Autowired
	ShoppingCartService shoppingCartService;

	public void commonData(Model model, User user) {
		Integer totalSave = 0;
		// get count yêu thích
		if (user != null) {
			totalSave = favoriteRepository.selectCountSave(user.getUserId());
		}

		Integer totalCartItems = shoppingCartService.getCount();

		model.addAttribute("totalSave", totalSave);

		model.addAttribute("totalCartItems", totalCartItems);

		Collection<CartItem> cartItems = shoppingCartService.getCartItems();
		model.addAttribute("cartItems", cartItems);

	}
}
