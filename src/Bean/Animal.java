package Bean;

public class Animal {
	/**
	 * Attribut de la classe Animal
	 */
	private String race;
	private String Surnom;
	private char sexe;
	private String numTatouage;
	public Animal accouple = null;
	
	
	
	/**
	 * 
	 * @param race
	 * @param surnom
	 * @param sexe
	 * @param numTatouage
	 */
	public Animal(String race, String surnom, char sexe, String numTatouage) {
		super();
		this.race = race;
		Surnom = surnom;
		this.sexe = sexe;
		this.numTatouage = numTatouage;
	}






	public String getRace() {
		return race;
	}




	public void setRace(String race) {
		this.race = race;
	}




	public String getSurnom() {
		return Surnom;
	}




	public void setSurnom(String surnom) {
		Surnom = surnom;
	}




	public char getSexe() {
		return sexe;
	}




	public void setSexe(char sexe) {
		this.sexe = sexe;
	}




	public String getNumTatouage() {
		return numTatouage;
	}




	public void setNumTatouage(String numTatouage) {
		this.numTatouage = numTatouage;
	}




	public Animal getAccouple() {
		return accouple;
	}



	/**
	 * 
	 * @param ajout a un animal MALE d'un Animal femelle acouplé
	 * necessite des sexe different et que la race des 2 animaux soit identiques 
	 * enfin necessite aussi que l'animal n'est pas deja quelquun avec qui il s'est acouplée
	 */
	public boolean setAccouple(Animal accouple) {
		
		boolean possible = false;
		if(this.sexe == 'M') {
			
			
			if(this.sexe != accouple.sexe ) {
				if(this.race.equals(accouple.race)){
					if(this.getAccouple() == null) {
						possible = true;
						this.accouple = accouple;
					}
					else {
						System.out.println("l'animal a deja un animal accouplé");
					}
				}else {
					System.out.println(" Impossible, un " + this.race + " ne peut pas s'accoupler avec un " + accouple.getRace());
				}
				
			} else {
				System.out.println("Impossible ! sex identique");
			}
		}else {
			System.out.println("impossible, l'information dois etre stocker dans l'animal");
		}
		
		return possible;
	}

	
	
	
	
	
	

	/**
	 * ToString des animaux
	 */
	@Override
	public String toString() {
		return "l' Animal  de race " + race + " avec pour surnom " + Surnom + " de sexe " + sexe + " et de numTatouage " + numTatouage
			+ " s'est accouplé avec " + accouple.getSurnom() + " qui est aussi de type " + accouple.getRace()+ " et de sexe " 
			 + accouple.getSexe() + " avec pour num de tatouage " + accouple.getNumTatouage() ;
	}
	
	
	
	
	
}




	