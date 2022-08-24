package com.cl.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cl.dto.Admin;
import com.cl.repository.AdminRepository;

@Repository
public class AdminDAO {
	
		@Autowired
		private AdminRepository repository;
		
		public Admin saveAdmin(Admin admin) {
			return repository.save(admin);
		}
		
	
}
