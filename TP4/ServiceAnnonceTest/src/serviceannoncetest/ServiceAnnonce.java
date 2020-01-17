/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceannoncetest;

/**
 *
 * @author Kevin
 */
class ServiceAnnonce {
    private static ListeAnnonces maListeAnnonce = new ListeAnnonces(null);
    
    static int creerNouvelleAnnonce(String contenu, String dateDeDebut) {
        Annonce annonce = new Annonce(contenu, dateDeDebut);
        int id = ListeAnnonces.maListeAnnonces.size();
        annonce.fixeId(id);
        maListeAnnonce.maListeAnnonces.add(annonce);
        
        return id;
    }

    static boolean editerAnnonceExistante(Annonce annonceAEditer) {
        return maListeAnnonce.editionAnnonce(annonceAEditer);
    }

    static ListeAnnonces donneAnnoncesExistantes() {
        return ServiceAnnonce.maListeAnnonce;
    }    
}
