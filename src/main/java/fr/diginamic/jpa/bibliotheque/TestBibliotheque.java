package fr.diginamic.jpa.bibliotheque;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.diginamic.bibliotheque.entities.Emprunt;
import fr.diginamic.bibliotheque.entities.Livre;


public class TestBibliotheque {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque-jpa");
		EntityManager em = emf.createEntityManager();
		
		//trouver un livre à partir de son titre
		TypedQuery<Livre> result = em.createQuery("select l from Livre l where l.titre='Germinal'",Livre.class);
		
		Livre livre = result.getResultList().get(0);
		System.out.println("\n" +livre.getId() + " / "+livre.getTitre() + " / "+ livre.getAuteur());
		
		//requete pour extraire un emprunt et tous ses livres associés
		TypedQuery<Emprunt> result2 = em.createQuery("select e from Emprunt e where e.id = 1", Emprunt.class);
		Emprunt emprunt =  result2.getResultList().get(0);
		System.out.println("\n" +emprunt);
		em.close();
		emf.close();
	}

}
