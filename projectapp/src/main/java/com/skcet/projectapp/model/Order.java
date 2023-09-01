package com.skcet.projectapp.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="foodorder")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date orderdate;
	private String menu;
	private int orderquantity;
	private double orderprice;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getOrderquantity() {
		return orderquantity;
	}
	public void setOrderquantity(int orderquantity) {
		this.orderquantity = orderquantity;
	}
	public double getOrderprice() {
		return orderprice;
	}
	public void setOrderprice(double orderprice) {
		this.orderprice = orderprice;
	}
	public Order(Long id, Date orderdate, String menu, int orderquantity, double orderprice) {
		super();
		this.id = id;
		this.orderdate = orderdate;
		this.menu = menu;
		this.orderquantity = orderquantity;
		this.orderprice = orderprice;
	}
	
}

