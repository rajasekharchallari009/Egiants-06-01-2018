
package com.egiantsprojects.practice.controllers;

import com.egiantsprojects.practice.services.UserOrdersService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Ramesh Fadatare
 *
 */
@Controller
public class HomeController
{
	@Autowired
	private UserOrdersService userOrdersService;
	
	@RequestMapping(value = {"/", "/app/users"}, method = RequestMethod.GET)
	public String getUsers(Model model)
	{
		model.addAttribute("users", userOrdersService.getUsers());
		model.addAttribute("orders", userOrdersService.getOrders());
		
		return "users";
	}
}
