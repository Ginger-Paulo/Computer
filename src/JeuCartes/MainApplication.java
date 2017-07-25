package JeuCartes;

import java.util.ArrayList;

public class MainApplication {

	public static void main(String[] args) {
		
		FabriqueDeck deck = new FabriqueDeck();
		deck.genere32();
		
		FabriqueDeck deck52 = new FabriqueDeck();
		deck.genere52();
	}

}
