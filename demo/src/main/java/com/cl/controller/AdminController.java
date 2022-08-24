package com.cl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cl.dao.AdminDAO;
import com.cl.dto.Admin;

@RestController
public class AdminController {
	
	@Autowired
	AdminDAO dao;
	
	
	
	
	@PostMapping("/save")
	public Admin saveAdmin(@RequestBody Admin admin) {
		return dao.saveAdmin(admin);
	}
	

	
	

}
