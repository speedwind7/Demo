package net.onest.server.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.onest.server.entity.Product;
import net.onest.server.entity.ShoppingCart;
import net.onest.server.entity.User;
import net.onest.server.service.ShoppingCartService;

@Controller
@RequestMapping("shoppingCart")
public class ShoppingCartController {
	@Autowired
	private ShoppingCartService shoppingCartService;
	
	@RequestMapping("checkout")
	public ModelAndView getUsers(HttpSession session) {
		ModelAndView mv = new ModelAndView("checkout");
		int uid=(int)session.getAttribute("uid");
		List<ShoppingCart> s=shoppingCartService.findAllShoppingCart();
		List<Product> products=shoppingCartService.findCheckout(uid);
		mv.addObject("products",products);

//		mv.addObject("check",c);
		return mv;
	}
	@RequestMapping("add")
	public ModelAndView addUser(int pid,ShoppingCart s,HttpSession session) {
		ModelAndView mv = new ModelAndView("checkout");
		int uid;
		uid=(int)session.getAttribute("uid");
		if(uid==0) {
			mv.addObject("message", "请先登录");
			mv.setViewName("redirect:sign");
		}
		else {
		s.setUid(uid);
		s.setPid(pid);
//		ShoppingCart sc=shoppingCartService.find(s);
//		if(s!=null) {
//			
//		}else {
		shoppingCartService.insertCart(s);
//			}	
			}	
		return mv;
	}
	@RequestMapping("save")
	public ModelAndView saveUser(ShoppingCart s) {
		ModelAndView mv = new ModelAndView("addCart");		
		shoppingCartService.insertCart(s);
		mv.setViewName("redirect:../index.jsp");
		return mv;
		}

}
