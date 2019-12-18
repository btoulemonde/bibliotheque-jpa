package fr.diginamic.bibliotheque.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="livre")

public class Livre {
	
	@Id
	private int id;
	
	public Livre(){}

	/** Getter
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/** Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

}
