package serviceannoncetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListeAnnonces {
    public static List<Annonce> maListeAnnonces = new ArrayList<Annonce>();
    
    ListeAnnonces(Annonce[] listOfAds){
        if(listOfAds != null){
            ListeAnnonces.maListeAnnonces.addAll(Arrays.asList(listOfAds));
        }
    }    
    
    @Override
    public String toString(){
       String message = "\nListe d'annonces : \n";
       
       for(Annonce annonce : this.maListeAnnonces){
           message += annonce.toString();
       }
       
       return message;
    }

    boolean editionAnnonce(Annonce adToEdit){
        int index = 0;
        
        for(Annonce annonce : this.maListeAnnonces){
            if(annonce.getID() == adToEdit.getID()){
                this.maListeAnnonces.remove(annonce);
                
                this.maListeAnnonces.add(index, adToEdit);
                System.out.println("ok");
                
                return true;
            }
            
            index++;
        }
        
        return false;
    }
}
