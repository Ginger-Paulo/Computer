package Mod�lisation;

public class RAM {

	private int capacit�RAM;
	
	//controleur pour la ram
	public RAM(int capacit�RAM) {
		this.capacit�RAM = capacit�RAM;
	}

	//les 2 petites fonctions
	public void initialiserRAM(){
		
		System.out.println("Initialisation m�moire " + capacit�RAM + " Go");
	}
	
	public void �teindreRAM(){
		System.out.println("Extinction m�moire vive");
	}
}
