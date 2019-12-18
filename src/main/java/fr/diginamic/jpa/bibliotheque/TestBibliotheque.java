package fr.diginamic.jpa.bibliotheque;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.diginamic.bibliotheque.entities.Livre;


public class TestBibliotheque {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque-jpa");
		EntityManager em = emf.createEntityManager();
		
		Livre f = em.find(Livre.class, 1);
		if(f != null){
			System.out.println(f.getId());
		}
		em.close();

	}

}
