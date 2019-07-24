package net.onest.server.dao;

import java.util.List;

import net.onest.server.entity.Product;

public interface ProductMapper {
	public List<Product> findAllProducts();

}
