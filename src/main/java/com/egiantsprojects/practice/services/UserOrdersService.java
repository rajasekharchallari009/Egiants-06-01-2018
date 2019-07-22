
package com.egiantsprojects.practice.services;

import java.util.List;


import com.egiantsprojects.practice.security.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.egiantsprojects.practice.orders.entities.Order;
import com.egiantsprojects.practice.orders.repositories.OrderRepository;
import com.egiantsprojects.practice.security.entities.User;

/**
 * @author Ramesh Fadatare
 *
 */
@Service
public class UserOrdersService
{
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional(transactionManager="securityTransactionManager")
	public List<User> getUsers()
	{
		return userRepository.findAll();
	}
	
	@Transactional(transactionManager="ordersTransactionManager")
	public List<Order> getOrders()
	{
		return orderRepository.findAll();
	}
}
