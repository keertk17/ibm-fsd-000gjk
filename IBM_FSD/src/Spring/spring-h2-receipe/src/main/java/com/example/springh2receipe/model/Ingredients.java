package com.example.springh2receipe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Ingredients {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private double amount;
	private String description;
	public Ingredients(double amount, String description, Long r_id) {
		super();
		this.amount = amount;
		this.description = description;
		this.r_id = r_id;
	}
	public Ingredients() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ingredients(double amount, String description, Long r_id, Receipe receipe) {
		super();
		this.amount = amount;
		this.description = description;
		this.r_id = r_id;
		this.receipe = receipe;
	}
	public Receipe getReceipe() {
		return receipe;
	}
	public void setReceipe(Receipe receipe) {
		this.receipe = receipe;
	}
	private Long r_id;
	@ManyToOne
	@JoinTable(name="ingredients_receipe",joinColumns = @JoinColumn(name = "receipe_id"),inverseJoinColumns = @JoinColumn(name = "ingredients_id"))
	private Receipe receipe;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getR_id() {
		return r_id;
	}
	public void setR_id(Long r_id) {
		this.r_id = r_id;
	}
	

}
