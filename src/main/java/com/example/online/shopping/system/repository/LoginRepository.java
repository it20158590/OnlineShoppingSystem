package com.example.online.shopping.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.online.shopping.system.models.Login;

public interface LoginRepository extends JpaRepository<Login, String>{
	public Login findByUsername(String username);
}
