package net.onest.server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.onest.server.dao.ShoppingCartMapper;
import net.onest.server.entity.Product;
import net.onest.server.entity.ShoppingCart;
import net.onest.server.service.ShoppingCartService;


@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
		@Autowired
		private ShoppingCartMapper shoppingCartMapper;
		@Override
		public List<ShoppingCart> findAllShoppingCart() {
			return shoppingCartMapper.findAllShoppingCart();
		}
		public int insertCart(ShoppingCart s) {
			return shoppingCartMapper.insertCart(s);
		};
		public List<Product> findCheckout(int Uid){
			return shoppingCartMapper.findCheckout(Uid);
		};

}
