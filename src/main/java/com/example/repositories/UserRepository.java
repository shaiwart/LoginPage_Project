package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.entities.User;
import jakarta.transaction.Transactional; 


@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query(value = "", nativeQuery = true) 
	public Integer loginUser(@Param("userName") String userName, @Param("password") String password);   
}
