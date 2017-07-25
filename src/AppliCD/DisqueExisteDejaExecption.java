package AppliCD;

public class DisqueExisteDejaExecption extends Exception{
	
public DisqueExisteDejaExecption(Disque disqueEnErreur) {
	super("Existe déjà (" +disqueEnErreur.getCodeBarre()+ ")");
	
	
}

}
