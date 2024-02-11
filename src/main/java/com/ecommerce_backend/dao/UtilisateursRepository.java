package com.ecommerce_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce_backend.entities.Utilisateurs;

@Repository
public interface UtilisateursRepository extends JpaRepository<Utilisateurs, Long>{

}
