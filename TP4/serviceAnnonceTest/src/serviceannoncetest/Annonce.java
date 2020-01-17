package serviceannoncetest;

public class Annonce {
    private Integer monIDAnnonce;
    private String maDateDeDebut = "";
    private String maDateDeFin = "";
    private String monContenu = "";
    
    public Annonce(){}
    
    public Annonce(String contenu, String dateDeDebut){
        this.monContenu = contenu;
        this.maDateDeDebut = dateDeDebut;
    }
    
    void fixeDateFin(String dateFin) {
        this.maDateDeFin = dateFin;
    }

    void fixeContenu(String contenu) {
        this.monContenu = contenu;
    }

    void sauvegarder() {
        ListeAnnonces.maListeAnnonces.add(this);
    }

    void fixeId(int idAnnonce) {
        this.monIDAnnonce = idAnnonce;
    }

    void fixeDateDebut(String date){
        this.maDateDeDebut = date;
    }
    
    public int getID(){
        return this.monIDAnnonce;
    }
    
    public String toString(){
        String message;
        
        if(this.monIDAnnonce != null) {
            message = "Id : " + this.monIDAnnonce + ", date de début : " + this.maDateDeDebut + ", date de fin : " + this.maDateDeFin + ", contenu : " + this.monContenu + "\n";
        } else {
             message = "Id : non existant, date de début : " + this.maDateDeDebut + ", date de fin : " + this.maDateDeFin + ", contenu : " + this.monContenu + "\n";
        }
        
        return message;
    }
}
