/**
 * 
 */
package com.egiantsprojects.practice.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.egiantsprojects.practice.security.entities.User;

/**
 * @author Ramesh Fadatare
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>
{
	
}

