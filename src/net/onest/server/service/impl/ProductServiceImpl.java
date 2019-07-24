package net.onest.server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.onest.server.dao.ProductMapper;
import net.onest.server.dao.ShoppingCartMapper;
import net.onest.server.entity.Product;
import net.onest.server.entity.ShoppingCart;
import net.onest.server.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public List<Product> findAllProducts() {
		return productMapper.findAllProducts();
	}

	
}
