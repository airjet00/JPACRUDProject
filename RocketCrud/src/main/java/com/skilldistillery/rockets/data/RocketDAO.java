package com.skilldistillery.rockets.data;

import java.util.List;

import com.skilldistillery.rockets.entities.Rocket;

public interface RocketDAO {

	public Rocket findById(int rocketId);
	
	public List<Rocket> findAll();
	
	public Rocket create(Rocket rocket);
	
	
}
