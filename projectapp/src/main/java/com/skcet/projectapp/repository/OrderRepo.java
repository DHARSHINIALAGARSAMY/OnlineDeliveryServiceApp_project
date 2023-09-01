package com.skcet.projectapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.projectapp.model.Order;

public interface OrderRepo extends JpaRepository<Order, Long> {

}

