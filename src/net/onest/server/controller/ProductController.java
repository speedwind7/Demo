package net.onest.server.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import net.onest.server.entity.User;
import net.onest.server.entity.Product;
import net.onest.server.entity.ShoppingCart;
import net.onest.server.service.ProductService;
import net.onest.server.service.ShoppingCartService;
import net.onest.server.service.UserService;

@Controller
@RequestMapping("products")
public class ProductController {
	@Autowired
	private ProductService productService;	
	@RequestMapping("products")
	public ModelAndView products(HttpSession session) {
		ModelAndView mv = new ModelAndView("products");
		List<Product> products=productService.findAllProducts();
		mv.addObject("products",products);

		return mv;
	}
	@RequestMapping("add")
	public ModelAndView User(HttpSession session,int pid) {
		ModelAndView mv = new ModelAndView("");
		int uid=(int)session.getAttribute("uid");		
		if(uid==0) {
			mv.addObject("message", "请先登录");
			mv.setViewName("redirect:sign");
		}else {
			mv.addObject("uid", uid);
			mv.addObject("pid", pid);
		mv.setViewName("redirect:addShoppingCart"); }
		return mv;
	}
	
	@RequestMapping("addShoppingCart")
	public ModelAndView addUser() {
		ModelAndView mv = new ModelAndView("");		
		mv.setViewName("redirect:../index.jsp");
		return mv;
	}

}
