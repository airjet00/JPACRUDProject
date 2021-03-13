package com.skilldistillery.rockets.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RocketTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Rocket rocket;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("rockets");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		rocket = em.find(Rocket.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		rocket = null;
	}

	@Test
	@DisplayName("Testing ")
	void test() {
		assertNotNull(rocket);
		assertEquals("Falcon 9", rocket.getName());
	}

}
