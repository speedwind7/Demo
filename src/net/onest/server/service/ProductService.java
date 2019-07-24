package net.onest.server.service;

import java.util.List;

import net.onest.server.entity.Product;
import net.onest.server.entity.ShoppingCart;

public interface ProductService {
	public List<Product> findAllProducts();

}
