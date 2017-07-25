package Modélisation;

public class RAM {

	private int capacitéRAM;
	
	//controleur pour la ram
	public RAM(int capacitéRAM) {
		this.capacitéRAM = capacitéRAM;
	}

	//les 2 petites fonctions
	public void initialiserRAM(){
		
		System.out.println("Initialisation mémoire " + capacitéRAM + " Go");
	}
	
	public void éteindreRAM(){
		System.out.println("Extinction mémoire vive");
	}
}
