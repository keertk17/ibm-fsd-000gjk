package com.example.springh2receipe.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Receipe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	private String cook_time;
	private String description;
	private String difficulty;
	private String direction;
	private String servings;
	private String source;
	private String url;
	private Long notes_id;
	private String prep_time;
	@ManyToOne
	@JoinTable(name="receipe_notes",joinColumns= @JoinColumn(name = "notes_id"),inverseJoinColumns = @JoinColumn(name = "receipe_id"))
	private Notes notes;
	@OneToMany(mappedBy="receipe",cascade=CascadeType.ALL )
	private Set<Ingredients>ingredients=new HashSet<>();
	public Receipe() {
		super();
	}
	public Notes getNotes() {
		return notes;
	}
	public void setNotes(Notes notes) {
		this.notes = notes;
	}
	public Set<Ingredients> getIngredients() {
		return ingredients;
	}
	public void setIngredients(Set<Ingredients> ingredients) {
		this.ingredients = ingredients;
	}
	public Receipe(String cook_time, String description, String difficulty, String direction, String servings,
			String source, String url, Long notes_id, String prep_time) {
		super();
		this.cook_time = cook_time;
		this.description = description;
		this.difficulty = difficulty;
		this.direction = direction;
		this.servings = servings;
		this.source = source;
		this.url = url;
		this.notes_id = notes_id;
		this.prep_time = prep_time;
	}
	public Receipe(String cook_time, String description, String difficulty, String direction, String servings,
			String source, String url, Long notes_id, String prep_time, Set<Ingredients> ingredients) {
		super();
		this.cook_time = cook_time;
		this.description = description;
		this.difficulty = difficulty;
		this.direction = direction;
		this.servings = servings;
		this.source = source;
		this.url = url;
		this.notes_id = notes_id;
		this.prep_time = prep_time;
		this.ingredients = ingredients;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCook_time() {
		return cook_time;
	}
	public void setCook_time(String cook_time) {
		this.cook_time = cook_time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getPrep_time() {
		return prep_time;
	}
	public void setPrep_time(String prep_time) {
		this.prep_time = prep_time;
	}
	public String getServings() {
		return servings;
	}
	public void setServings(String servings) {
		this.servings = servings;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Long getNotes_id() {
		return notes_id;
	}
	public void setNotes_id(Long notes_id) {
		this.notes_id = notes_id;
	}
	
	

}
