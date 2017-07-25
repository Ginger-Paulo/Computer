package AppliCD;

import java.util.ArrayList;
import java.util.List;

import Mod�lisation.Saisie;

public class Biblioth�que {

	private List<Disque> disques;
	

	//cr�ation d'une liste de disques
	public Biblioth�que() {
		disques = new ArrayList<>();
	}
	//Option get
	public List<Disque> getDisques() {
		return disques;
	}
	//Ajout de disques (le void permet de ne pas mettre de return
	void ajouterDisque(Disque disque){ //throws DisqueExisteDejaExecption {
		//if (rechercherChansons(disque.getCodeBarre() != null)){
			//throw new DisqueExisteDejaExecption(disque);
		disques.add(disque);
	}
	//Choix du disque via le code barre
	public Disque getDisques(String codeBarre) {
		//Pour les disques
		for (Disque disque : disques) {
			//L'entr�e de caract�res pour le code barre �gale � celui du disque
			String codeBarreDisque = disque.getCodeBarre();
			//Si les deux sont �gaux alors, il retourne le disque
			if (codeBarreDisque.equals(codeBarre))
				return disque;
		}
		return null;
	}
	//On veut afficher les disques
	public void afficherDisques() {

		System.out.println("Liste des disques de la biblio");
		System.out.println("Il y a " + disques.size() + "disque(s)");

		//Pour chaque disque, il m'affiche le d�tail via la fonction dans disque
		for (Disque disque : disques)
			disque.afficherDetails();
	}
	
	//Fonction pour ajouter un disque
    public boolean ajoutDisque(Disque newDisque) {
        for(int i =0;i<disques.size();i++){
        	if(newDisque.getNom().equals(disques.get(i).getNom())){
        		System.out.println("Le disque est d�j� existant");
        		return false;
        	} 
        }
    	
        System.out.println("Cr�ation du disque");
        int chansons = Saisie.saisieInt("Combien de chansons voulez vous ajouter ?");
        for (int i = 0; i < chansons; i++) {
            String nom = Saisie.saisie("Nom chanson :");
            int duree = Saisie.saisieInt("dur�e chanson : ");
            Chanson chanson = new Chanson(nom, duree);
            newDisque.ajouterChanson(chanson);
        }
        return true;
    }
    
	public List<Chanson> rechercherChansons(String recherche){
	
		recherche = recherche.toLowerCase();
		List <Chanson> resultat = new ArrayList<>();
		for (Disque disque : disques) {
			List <Chanson> ListeChansons =disque.getChansons();
			
			for (Chanson chanson :ListeChansons){
				if (chanson.getNom().equalsIgnoreCase(recherche)){
					resultat.add(chanson);
					
					if(chanson.getNom().toLowerCase().contains(recherche))
						resultat.add(chanson);				}
				
			}
		}
		return resultat; }
	
public int getNbDisque(){
	int nbDisque = this.disques.size();
	return nbDisque;
}
	
	boolean retirerDisque (String codeBarre){
		for(Disque disque : disques){
			if(disque.getCodeBarre().equals(codeBarre)){
				disques.remove(disque);
				System.out.println("Nombres de disques restants:" + getNbDisque() );
				return true ;
			}
		}
		System.out.println("Album inconnu");
		return false;
	}
	//cr�ation commentaire !
}
