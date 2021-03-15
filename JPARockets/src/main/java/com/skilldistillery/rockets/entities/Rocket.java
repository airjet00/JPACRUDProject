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
	
	private Double diameter;
	
	private String country;
	
	private Double costPerLaunch;
	
	private Integer mass;

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

	//TODO Take out
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

	public Double getDiameter() {
		return diameter;
	}

	public void setDiameter(Double diameter) {
		this.diameter = diameter;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getCostPerLaunch() {
		return costPerLaunch;
	}

	public void setCostPerLaunch(Double costPerLaunch) {
		this.costPerLaunch = costPerLaunch;
	}

	public Integer getMass() {
		return mass;
	}

	public void setMass(Integer mass) {
		this.mass = mass;
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
		builder.append(", diameter=");
		builder.append(diameter);
		builder.append(", country=");
		builder.append(country);
		builder.append(", costPerLaunch=");
		builder.append(costPerLaunch);
		builder.append(", mass=");
		builder.append(mass);
		builder.append("]");
		return builder.toString();
	}






	
	
}
