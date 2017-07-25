package AppliCD;

import java.util.ArrayList;
import java.util.List;

public class Chanson {
	
	private String nomC;
	private int dur�e;
	private List<Disque> disques;
	private List<Chanson> chansons;
	
	//constructeur
	public Chanson(String nom, int dur�e) {
		this.nomC = nom;
		this.dur�e = dur�e;
	}
	//fonction afficher, juste avec un sysout
	public void afficher(){
		System.out.println(nomC + "( " + dur�e + "s.)");
	
	}
	//getters
	public String getNom() {
		return nomC;
	}
	public int getDur�e() {
		return dur�e;
	}

	//Utilisation d'un override  et toString pour transformer notre cha�ne de caract�res bizarres
	//avec un return plus structur�.
	@Override
	public String toString() {
		return "Chanson [nom=" + nomC + ", dur�e=" + dur�e + "]";
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
