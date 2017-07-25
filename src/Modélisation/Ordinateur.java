package Mod�lisation;

import Mod�lisation.RAM;
import Mod�lisation.DisqueDur;

public class Ordinateur {
	
	//cr�ation des �l�ments
	private String mod�le;
	//apr�s avoir cr�e la classe RAM, on rajoute la m�moire dans notre classe ordi
	private RAM capacit�RAM;
	//ici un tableau de DD
	private DisqueDur [] capacit�DD;
	
	//on fait le constructeur avec ALT+Shift+S puis O
	public Ordinateur(String mod�le, RAM/*autre: int*/ capacit�RAM, DisqueDur/* autre : int*/ [] capacit�DD) {
		
		//toujours initialiser les �l�ments avec this ou new
		this.mod�le = mod�le;//le mod�le de this est en lien avec le mod�le de public et non le private. On prend le plus proche
		this.capacit�RAM = capacit�RAM;
		//autre : capacit�RAM = new RAM(capacit�RAM);
		this.capacit�DD = capacit�DD;
		//cr�ation du tableau de DD
		//autre : disquesdurs = new DisqueDur[capacit�DD.lenght];
		//for(int i=0;i<capacit�DD.lenght;i++){
		//DisqueDur disqueD = new DisqueDur (capacit�DD[i]);
		//disquesdurs[i]= disqueD }
		
	}

	//cr�ation des fonctions
	public void allumer(){
		//syso pour afficher
		System.out.println("L'ordinateur d�marre...");
		//Appel de la fonction RAM en commen�ant par 'capacit�RAM', le truc gris puis la fonction que l'on souhaite via CTRL+espace
		capacit�RAM.initialiserRAM();
		System.out.println("D�marrage des Disques Durs");
		/*for(DisqueDur disqueDur : disquesDurs
		 * disqueDur.demarrer();
		 * if(disquesDurs.lenght >0)
		 * {disquesDurs[0]
		 */
		System.out.println("Ordinateur en service");
		
	}

	public void �teindre(){
		System.out.println(" Extinction des DD");
		System.out.println("...DD...");
		//idem qu'en haut
		capacit�RAM.�teindreRAM();
		System.out.println("Ordinateur �teint");
	}
}
