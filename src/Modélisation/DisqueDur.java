package Mod�lisation;

public class DisqueDur {
	
	int capacit�DD;

	public DisqueDur(int capacit�DD) {
		//le this fait partie du constructeur ;)
		this.capacit�DD = capacit�DD;
	}

	public void d�marrerDD(){
		System.out.println("D�marrage DD " + capacit�DD + " Go");
		
	}
	
	public void lireDD(){
		System.out.println("Lecture sur disque");
	}

	public void �teindreDD(){
		System.out.println("Extinction des DD");
	}

}
