package com.example.springh2receipe.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Notes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long n_id;
	private String r_notes;
	//private Long r_id;
	@OneToMany(mappedBy="notes" ,cascade = CascadeType.ALL)
	private Set<Receipe>receipes;
	
	
	public Long getN_id() {
		return n_id;
	}
	public void setN_id(Long n_id) {
		this.n_id = n_id;
	}
	public Set<Receipe> getReceipes() {
		return receipes;
	}
	public void setReceipes(Set<Receipe> receipes) {
		this.receipes = receipes;
	}
	public Notes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Notes(String r_notes) {
		super();
		this.r_notes = r_notes;
		//this.r_id = r_id;
	}
	
	public Notes(String r_notes, Set<Receipe> receipes) {
		super();
		this.r_notes = r_notes;
		this.receipes = receipes;
	}
//	public Long getId() {
//		return n_id;
//	}
//	public void setId(Long id) {
//		this.n_id = id;
//	}
	public String getR_notes() {
		return r_notes;
	}
	public void setR_notes(String r_notes) {
		this.r_notes = r_notes;
	}
//	public Long getR_id() {
//		return r_id;
//	}
//	public void setR_id(Long r_id) {
//		this.r_id = r_id;
//	}
	

}
