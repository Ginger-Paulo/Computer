package AppliCD;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;

import Modélisation.Saisie;

public class Main {
	
	

	public static void main(String[] args) {
		//création d'une nouvelle bibliothèque(=comme l'ordi)
		Bibliothèque biblio = new Bibliothèque ();
		
		//création de disque
		Disque disque = new Disque ("AC", "6464516");
		Disque disque2 = new Disque ("DC","666");
		
		//création de chanson que l'on ajoute au disque
		/*disque.ajouterChanson(new Chanson("Intro",90));
		disque.ajouterChanson(new Chanson("IntroA",90));
		disque.ajouterChanson(new Chanson("IntroB",90));
		disque.ajouterChanson(new Chanson("IntroC",90));
		disque.ajouterChanson(new Chanson("IntroD",90));
		disque2.ajouterChanson(new Chanson("Thunder",90));
		disque2.ajouterChanson(new Chanson("Blabla",90));*/
		//les disques sont ajoutés dans la bibliothèque
		biblio.ajouterDisque(disque);
		biblio.ajouterDisque(disque2);
		
		Chanson chanson = new Chanson ("Intro",90);
		Chanson chansonA = new Chanson ("IntroA",90);
		Chanson chansonB = new Chanson ("IntroB",90);
		Chanson chansonC = new Chanson ("IntroC",90);
		Chanson chansonD = new Chanson ("IntroD",90);
		Chanson chansonT = new Chanson ("Thunder",90);
		Chanson chansonBl = new Chanson ("Blabla",90);
		disque.ajouterChanson(chanson);
		disque.ajouterChanson(chansonA);
		disque.ajouterChanson(chansonB);
		disque.ajouterChanson(chansonC);
		disque.ajouterChanson(chansonD);
		disque2.ajouterChanson(chansonT);
		disque2.ajouterChanson(chansonBl);
		
		
		
		
		
		//construction d'un questionnaire avec les infos
		//On commence par un while(true){....}
		while (true)
		{
			//Présenter le menu
			System.out.println("1.Listes des disques");
			System.out.println("2.Détail d'un disque");
			System.out.println("3.Recherche de chanson");
			System.out.println("4.Ajouter un disque");
			System.out.println("5.Effacer un disque");
			System.out.println("6.Ajouter un disquev2");
			System.out.println("7.Nouveau disque dans le fichier");
			System.out.println("8.Charger les données");
			System.out.println("Q.Quitter");
			//demander la saisie (lien avec la classe saisie
			String saisie = Saisie.saisie("Quel est ton choix ?");
			//entreprendre l'action adéquate, pour chaque élément rentré
			//on va avoir un retour spécifique
			switch (saisie){
			//si on clique sur la case 1
			case "1":
				//Affichage des disques avec leurs chansons
				biblio.afficherDisques();
				//Après la lecture, on fait un break pour casser l'interaction
				break;
			
			//si on clique sur la case 2
			case "2":
				//demande de code barre
				String codeBarre = Saisie.saisie("code barre stp");
				//a partir du code barre entre, lien avec les codes barres déjà existants
				Disque disqueTrouve = biblio.getDisques(codeBarre);
				//boucle lié à l'entrée
				if ( disque == null)
					System.out.println("Pas de disque avec ce CB");
				else
					disqueTrouve.afficherDetails();
				//case à la fin
				break;

			case "3":
				String chansonCherchee = Saisie.saisie("Quel est le nom de la chanson ?");
			List<Chanson> chansons = biblio.rechercherChansons(chansonCherchee);
			
				
				if ( chansons == null || chansons.isEmpty())
					System.out.println("Pas de chanson avec ce nom !");
				else{
					for(Chanson chanson1 : chansons){
						chanson1.afficher();
					}
				}
					
				//case à la fin
				break;
				
			case "4":
                String disqueAjout = Saisie.saisie("Quel disque voulez vous ajouter ? ");
                System.out.println("Quentin c'est trop un beau gosse");
                String codeBarreAjout = Saisie.saisie("son codeBarre :");
                Disque newDisque = new Disque(disqueAjout, codeBarreAjout);
                biblio.ajoutDisque(newDisque);
                biblio.ajouterDisque(newDisque);
                break;
                
			case "5":
				String disqueCherche = Saisie.saisie("CB du disque à retirer");
				boolean disqueEfface=biblio.retirerDisque(disqueCherche);
				if(disqueEfface){
					System.out.println("Disque effacée");
				}else {
					System.out.println("Disque n'existe pas");
				}
			case "6":
				String nomdisque = Saisie.saisie("Nom ?");
				String codebarre = Saisie.saisie("CB ?");
				Disque disque1 = new Disque(nomdisque, codebarre);
				while(true){
					Chanson chanson1 = saisirChanson();
					if(chanson1 != null){
						disque1.ajouterChanson(chanson1);
					}else {
						break;
					}
				}
				biblio.ajouterDisque(disque1);
				System.out.println("Le disque est ajouté");
				biblio.afficherDisques();
				
			case "7" :
				String nomdisque1 = Saisie.saisie("Nom du disque ?");
				String codebarre1 = Saisie.saisie("Code Barre ?");
				Disque newDisque1 = new Disque(nomdisque1, codebarre1);
	                biblio.ajoutDisque(newDisque1);
	                biblio.ajouterDisque(newDisque1);
	                
	                new Save().ecrireFichier("Bibli", nomdisque1, codebarre1);
	                break;
			/*case "8":
				chargerDonnees(biblio);
				System.out.println("Données chargées");
				break;*/
	             
				
				//Induire une touche de sortie via le system.exit	
				case "Q":
				case "q":
				System.exit( 0);
					break;
					
				//Si on rentre une autre touche, erreur par défaut
				default:
					System.out.println("Ce choix n'existe pas !");
			
			}
		
		}
		

	}
	
	/*private static void sauvegarderDonnes(Bibliothèque biblio){
		
		//ouvrir fichier
		File file = new File( "bibliotheque.txt" );
		FileOutputStream fos = new FileOutputStream( file );
		
		PrintWriter writer= new PrintWriter( fos );
		
		//ecrire tous les disques
		//POUR CHAQUE DISQUE
		for (Disque disque : biblio.getDisques()){
			
			writer.println(disque.getNom());
			writer.println(disque.getCodeBarre());
			writer.println(disque.getChansons().size());
			for (Chanson chanson : disque.getChansons()){
				writer.println(chanson.getNom());
				writer.println(chanson.getDurée());
			}
			
		}
	}*/

	private static Chanson saisirChanson(){
		String nomchan = Saisie.saisie("Nom de la chanson ?");
		if(nomchan == null || nomchan.isEmpty())
			return null;
		int durée = Saisie.saisieInt("Durée mon gars ?");
		return new Chanson(nomchan,durée);
	}
}
