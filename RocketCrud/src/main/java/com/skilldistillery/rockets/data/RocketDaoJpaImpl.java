package com.skilldistillery.rockets.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.rockets.entities.Rocket;

@Service
@Transactional
public class RocketDaoJpaImpl implements RocketDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Rocket findById(int rocketId) {
		
		return em.find(Rocket.class, rocketId);
	}

	@Override
	public List<Rocket> findAll() {
		List<Rocket> rockets;
		String query = "SELECT r FROM Rocket r";
		
		rockets = em.createQuery(query, Rocket.class).getResultList();
		
		return rockets;
	}

	@Override
	public Rocket create(Rocket rocket) {

		em.persist(rocket);
		
		em.flush();
		
		return rocket;
	}
	
	public Rocket update(int rid, String name, Integer height, String description, Double diameter, String country,
			Double costPerLaunch, Integer mass) {
		
		Rocket rocket = em.find(Rocket.class, rid);
		
		rocket.setName(name);
		rocket.setHeight(height);
		rocket.setDescription(description);
		rocket.setDiameter(diameter);
		rocket.setCountry(country);
		rocket.setCostPerLaunch(costPerLaunch);
		rocket.setMass(mass);
		
		em.persist(rocket);
		
		return rocket;
	}

	@Override
	public Rocket delete(int rid) {

		Rocket rocket = em.find(Rocket.class, rid);
		
		em.remove(rocket);
		
		return rocket;
	}

}
