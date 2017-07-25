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
	
	//Fonction pour afficher le d�tail
	public void afficherDetails(){
		//Lien avec le private juste en dessous
		afficherEntete();
		//Permet dans le d�tail d'un disque d'afficher toutes les chansons
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
	public int getDur�e (){
		//On met une valeur par d�faut pour avoir le totale
		int dur�etot =0;
		//Boucle for pour la lecture de toutes les chansons
		for (Chanson chanson :chansons){
			//On demande ainsi la dur�e totale
			dur�etot += chanson.getDur�e();
		}
		return dur�etot;
	}
	public String getNom() {
		return nomD;
	}

	public String getCodeBarre() {
		return codeBarre;
	}


}
