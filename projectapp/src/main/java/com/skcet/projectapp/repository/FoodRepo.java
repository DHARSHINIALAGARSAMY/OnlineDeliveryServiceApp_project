package com.skcet.projectapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.projectapp.model.FoodMenu;

public interface FoodRepo extends JpaRepository<FoodMenu, Long>{

}