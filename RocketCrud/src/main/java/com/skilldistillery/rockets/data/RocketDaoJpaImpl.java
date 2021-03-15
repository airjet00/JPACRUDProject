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

		em.getTransaction().begin();
	    
		String sql = "INSERT INTO Rocket (name, height, description) "
				+ " VALUES (rocket.getName(), rocket.getHeight, rocket.getDescription)";

		em.createQuery(sql, Rocket.class).executeUpdate();
		
		em.persist(rocket);
		
		em.flush();
		
		em.getTransaction().commit();
		
		return rocket;
	}

}
