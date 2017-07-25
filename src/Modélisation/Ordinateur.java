package Modélisation;

import Modélisation.RAM;
import Modélisation.DisqueDur;

public class Ordinateur {
	
	//création des éléments
	private String modèle;
	//après avoir crée la classe RAM, on rajoute la mémoire dans notre classe ordi
	private RAM capacitéRAM;
	//ici un tableau de DD
	private DisqueDur [] capacitéDD;
	
	//on fait le constructeur avec ALT+Shift+S puis O
	public Ordinateur(String modèle, RAM/*autre: int*/ capacitéRAM, DisqueDur/* autre : int*/ [] capacitéDD) {
		
		//toujours initialiser les éléments avec this ou new
		this.modèle = modèle;//le modèle de this est en lien avec le modèle de public et non le private. On prend le plus proche
		this.capacitéRAM = capacitéRAM;
		//autre : capacitéRAM = new RAM(capacitéRAM);
		this.capacitéDD = capacitéDD;
		//création du tableau de DD
		//autre : disquesdurs = new DisqueDur[capacitéDD.lenght];
		//for(int i=0;i<capacitéDD.lenght;i++){
		//DisqueDur disqueD = new DisqueDur (capacitéDD[i]);
		//disquesdurs[i]= disqueD }
		
	}

	//création des fonctions
	public void allumer(){
		//syso pour afficher
		System.out.println("L'ordinateur démarre...");
		//Appel de la fonction RAM en commençant par 'capacitéRAM', le truc gris puis la fonction que l'on souhaite via CTRL+espace
		capacitéRAM.initialiserRAM();
		System.out.println("Démarrage des Disques Durs");
		/*for(DisqueDur disqueDur : disquesDurs
		 * disqueDur.demarrer();
		 * if(disquesDurs.lenght >0)
		 * {disquesDurs[0]
		 */
		System.out.println("Ordinateur en service");
		
	}

	public void éteindre(){
		System.out.println(" Extinction des DD");
		System.out.println("...DD...");
		//idem qu'en haut
		capacitéRAM.éteindreRAM();
		System.out.println("Ordinateur éteint");
	}
}
