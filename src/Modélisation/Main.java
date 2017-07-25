package Modélisation;

public class Main {

	public static void main(String[] args) {
		
		RAM ram = new RAM(25);
		DisqueDur disquesdurs [] = {new DisqueDur (200), new DisqueDur (1000)};  
		
		//On définit le nouveau modèle d'orinateur
		Ordinateur ordi = new Ordinateur("ROG",ram, disquesdurs);
		//Pour prendre une fonction d'une autre classe, on prend l'objet ordi !!!!!!!!!!!!!!!!!!
		//J'appelle les méthodes de type ordinateur
		ordi.allumer();
		ordi.éteindre();

		
	}

}
