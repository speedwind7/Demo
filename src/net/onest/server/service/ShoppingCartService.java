package net.onest.server.service;

import java.util.List;

import net.onest.server.entity.Product;
import net.onest.server.entity.ShoppingCart;

public interface ShoppingCartService {
	public List<ShoppingCart> findAllShoppingCart();
	public int insertCart(ShoppingCart s);
	public List<Product> findCheckout(int Uid);

}
