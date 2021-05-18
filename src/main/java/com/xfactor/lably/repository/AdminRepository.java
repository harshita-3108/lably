package com.xfactor.lably.repository;

import com.xfactor.lably.entity.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
//entity type && primary key type is long
public interface AdminRepository extends JpaRepository<Admin,Long>{
    
}
