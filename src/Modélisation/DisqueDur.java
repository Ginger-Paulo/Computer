package Modélisation;

public class DisqueDur {
	
	int capacitéDD;

	public DisqueDur(int capacitéDD) {
		//le this fait partie du constructeur ;)
		this.capacitéDD = capacitéDD;
	}

	public void démarrerDD(){
		System.out.println("Démarrage DD " + capacitéDD + " Go");
		
	}
	
	public void lireDD(){
		System.out.println("Lecture sur disque");
	}

	public void éteindreDD(){
		System.out.println("Extinction des DD");
	}

}
