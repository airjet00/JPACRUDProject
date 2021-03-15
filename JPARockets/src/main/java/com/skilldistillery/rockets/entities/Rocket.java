package com.skilldistillery.rockets.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rocket {

	@Id
	private int id;
	
	private String name;
	
	private Integer height;
	
	private String description;

	public Rocket() {}
	
	public Rocket(int id, String name, Integer height, String description) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rocket [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", height=");
		builder.append(height);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}


	
	
}
