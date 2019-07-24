package net.onest.server.dao;

import java.util.List;

import net.onest.server.entity.Product;
import net.onest.server.entity.ShoppingCart;
public interface ShoppingCartMapper {
	public List<ShoppingCart> findAllShoppingCart(); 
	public int insertCart(ShoppingCart s);
	public List<Product> findCheckout(int Uid);
	
}
