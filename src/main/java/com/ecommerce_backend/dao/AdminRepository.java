package com.ecommerce_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce_backend.entities.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{

}
