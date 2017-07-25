package AppliCD;

import java.util.ArrayList;
import java.util.List;

public class Disque {

	private String nomD;
	private String codeBarre;
	private List<Chanson> chansons;
	
	//Fonction pour ajouter une chanson
	public void ajouterChanson(Chanson chanson)
	{
		//On utilise pour toutes les chansons le .add dans chanson
		chansons.add(chanson);
	}
	
	//Fonction pour afficher le détail
	public void afficherDetails(){
		//Lien avec le private juste en dessous
		afficherEntete();
		//Permet dans le détail d'un disque d'afficher toutes les chansons
		for(Chanson chanson : chansons)
			chanson.afficher();
	}
	public void afficherEntete()
	{
		System.out.println("Disque : " + nomD);
		System.out.println("code barre :" + codeBarre);
	}
	//constructeur
	public Disque(String nom, String codeBarre) {
		this.nomD = nom;
		this.codeBarre = codeBarre;
		chansons = new ArrayList<>();
	}
	//getters
	public List<Chanson> getChansons() {
		return chansons;
	}
	public int getDurée (){
		//On met une valeur par défaut pour avoir le totale
		int duréetot =0;
		//Boucle for pour la lecture de toutes les chansons
		for (Chanson chanson :chansons){
			//On demande ainsi la durée totale
			duréetot += chanson.getDurée();
		}
		return duréetot;
	}
	public String getNom() {
		return nomD;
	}

	public String getCodeBarre() {
		return codeBarre;
	}


}
