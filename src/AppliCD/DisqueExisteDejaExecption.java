package AppliCD;

public class DisqueExisteDejaExecption extends Exception{
	
public DisqueExisteDejaExecption(Disque disqueEnErreur) {
	super("Existe d�j� (" +disqueEnErreur.getCodeBarre()+ ")");
	
	
}

}
