package Mod�lisation;

public class Main {

	public static void main(String[] args) {
		
		RAM ram = new RAM(25);
		DisqueDur disquesdurs [] = {new DisqueDur (200), new DisqueDur (1000)};  
		
		//On d�finit le nouveau mod�le d'orinateur
		Ordinateur ordi = new Ordinateur("ROG",ram, disquesdurs);
		//Pour prendre une fonction d'une autre classe, on prend l'objet ordi !!!!!!!!!!!!!!!!!!
		//J'appelle les m�thodes de type ordinateur
		ordi.allumer();
		ordi.�teindre();

		
	}

}
