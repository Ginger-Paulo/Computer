package JeuCartes;

import java.util.ArrayList;
import java.util.List;


public class FabriqueDeck {
	
	//On cherche à créer un deck de 32 cartes, on génère une liste
	List<Carte> genere32(){
		//On fait un nouveau deck come
		List<Carte> deck32 = new ArrayList<>();
		//On attribut 8 cartes pour chaque couleur
		for (int i=1;i<9;i++){
			Carte carte = new Carte(Couleur.PIQUE,i);
			deck32.add(carte);
		}
		for (int i=1;i<9;i++){
			Carte carte = new Carte(Couleur.CARREAU,i);
			deck32.add(carte);
		}
		for (int i=1;i<9;i++){
			Carte carte = new Carte(Couleur.COEUR,i);
			deck32.add(carte);
		}
		for (int i=1;i<9;i++){
			Carte carte = new Carte(Couleur.TREFLE,i);
			deck32.add(carte);
		}
		System.out.println(deck32);
		return deck32;
	}
	
	
	
	List<Carte> genere52(){
		List<Carte> deck52 = new ArrayList<>();
		for (int i=1;i<14;i++){
			Carte carte = new Carte(Couleur.PIQUE,i);
			deck52.add(carte);
		}
		for (int i=1;i<14;i++){
			Carte carte = new Carte(Couleur.CARREAU,i);
			deck52.add(carte);
		}
		for (int i=1;i<14;i++){
			Carte carte = new Carte(Couleur.COEUR,i);
			deck52.add(carte);
		}
		for (int i=1;i<14;i++){
			Carte carte = new Carte(Couleur.TREFLE,i);
			deck52.add(carte);
		}
		return deck52;
	}

}
