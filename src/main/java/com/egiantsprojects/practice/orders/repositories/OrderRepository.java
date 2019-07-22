/**
 * 
 */
package com.egiantsprojects.practice.orders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.egiantsprojects.practice.orders.entities.Order;

/**
 * @author Ramesh Fadatare
 *
 */
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
