package serviceannoncetest;

public class ImplServiceAnnonce
{
    public static int creerNouvelleAnnonce(String contenu, String dateFin)
    {
        Annonce nouvelleAnnonce = new Annonce();
        nouvelleAnnonce.fixeDateFin(dateFin);
        nouvelleAnnonce.fixeContenu(contenu);
        nouvelleAnnonce.sauvegarder();

        return 1;
    }

    public static boolean editerAnnonceExistante(Annonce adToEdit)
    {
        ListeAnnonces maListeAnnonces = ImplServiceAnnonce.donneAnnoncesExistantes();
        
        return maListeAnnonces.editionAnnonce(adToEdit);
    }

    public static ListeAnnonces donneAnnoncesExistantes()
    {
        Annonce[] listOfAds =
        {
            new Annonce(), new Annonce(), new Annonce()
        };
        ListeAnnonces listToReturn = new ListeAnnonces(listOfAds);
        return listToReturn;
    }

    public static void fixeDateParution(String dateParution)
    {
        System.out.println(dateParution + " fixee.");
    }

    public static void main(String args[])
    {
        int idAnnonce = ServiceAnnonce.creerNouvelleAnnonce(
                "Vends Clio 2004",
                "4/21/2011");
   
        Annonce annonceAEditer = new Annonce();
        annonceAEditer.fixeId(idAnnonce);
        annonceAEditer.fixeDateDebut("4/8/2011");
        annonceAEditer.fixeDateFin("4/30/2011");
        annonceAEditer.fixeContenu(
                "Vends Airbus 320. Peu servi.");

		// remplace l'annonce ayant le meme ID
        // return true si remplacement OK		
        boolean remplacement = ServiceAnnonce.editerAnnonceExistante(annonceAEditer);
		if (remplacement)
		    System.out.println("Remplacement OK");
	    else
		    System.out.println("Probleme remplacement : " + annonceAEditer);

        ListeAnnonces listeAnnonces = ServiceAnnonce.donneAnnoncesExistantes();
        System.out.println(listeAnnonces.toString());
    }
}