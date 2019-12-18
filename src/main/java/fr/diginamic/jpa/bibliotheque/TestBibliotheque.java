package fr.diginamic.jpa.bibliotheque;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.diginamic.bibliotheque.entities.Livre;


public class TestBibliotheque {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque-jpa");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Livre> result = em.createQuery("select l from Livre l where l.titre='Germinal'",Livre.class);
		
		
		
		Livre livre = result.getResultList().get(0);
		System.out.println(livre.getId() + " / "+livre.getTitre() + " / "+ livre.getAuteur());
		
		em.close();
	}

}
