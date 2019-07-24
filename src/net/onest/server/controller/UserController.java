package net.onest.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import net.onest.server.entity.User;
import net.onest.server.service.UserService;

@Controller
@SessionAttributes(value= {"uid"})
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("userList")
	public ModelAndView getUsers() {
		ModelAndView mv = new ModelAndView("userList");
		List<User> users = userService.findAllUsers();
		mv.addObject("users", users);
		return mv;
	}
	
	@RequestMapping("add")
	public ModelAndView addUser() {
		ModelAndView mv = new ModelAndView("addUser");	
		return mv;
	}
	
	@RequestMapping("save")
	public ModelAndView saveUser(User u) {
		ModelAndView mv = new ModelAndView("addUser");
		User use=userService.signup(u);
		if(use!=null) {
			mv.addObject("message","用户名已被注册");		
		}else if(u.getPassword().equals("")){
			mv.addObject("message","密码不能为空");
		}
		else {
			userService.insertUser(u);
			mv.setViewName("redirect:../index.jsp");
		}
		return mv;
	}
	@RequestMapping("sign")
	public ModelAndView sign() {
		ModelAndView mv=new ModelAndView("sign");
		User u = new User();
		mv.addObject("user", u);
		return mv;
	}
	@RequestMapping("signon")
	public ModelAndView signup(ModelMap model,User u) {
		ModelAndView mv=new ModelAndView("");
		User user=userService.signon(u);
		if(user!=null) {
			int uid=user.getId();
			model.addAttribute("uid",uid);
			mv.setViewName("redirect:../index.jsp");
		}else {
			mv.setViewName("sign");
			mv.addObject("message", "密码或账户错误");
		}
		return mv;
	}
	
}
