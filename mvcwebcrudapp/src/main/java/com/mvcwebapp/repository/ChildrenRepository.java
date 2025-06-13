package com.mvcwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvcwebapp.entity.Children;

@Repository
public interface ChildrenRepository extends JpaRepository<Children, Integer>{

}