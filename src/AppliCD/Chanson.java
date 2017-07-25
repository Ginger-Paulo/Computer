package AppliCD;

import java.util.ArrayList;
import java.util.List;

public class Chanson {
	
	private String nomC;
	private int durée;
	private List<Disque> disques;
	private List<Chanson> chansons;
	
	//constructeur
	public Chanson(String nom, int durée) {
		this.nomC = nom;
		this.durée = durée;
	}
	//fonction afficher, juste avec un sysout
	public void afficher(){
		System.out.println(nomC + "( " + durée + "s.)");
	
	}
	//getters
	public String getNom() {
		return nomC;
	}
	public int getDurée() {
		return durée;
	}

	//Utilisation d'un override  et toString pour transformer notre chaîne de caractères bizarres
	//avec un return plus structuré.
	@Override
	public String toString() {
		return "Chanson [nom=" + nomC + ", durée=" + durée + "]";
	}
	
	public void afficherDeChan(String recherche){

		String result ="";
		
		for (Disque disque : disques){
			for(int i=0;i< disque.getChansons().size();i++){
				
				String chanson = disque.getChansons().get(i).getNom();
				if(recherche.equals(chanson)){
					
					result = disque.getNom();
					System.out.println(result);
				}
					
			}
		}
		
	
	}

	
	
	

}
