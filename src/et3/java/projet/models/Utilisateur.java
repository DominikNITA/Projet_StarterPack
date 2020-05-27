package et3.java.projet.models;

public class Utilisateur {

    private String id;
    Integer quotaMax;
    Personne personne;

    public Utilisateur(String id, Integer quotaMax, Personne personne) {
        this.id = id;
        this.quotaMax = quotaMax;
        this.personne = personne;
    }

    Integer getQuotaMax() {
        return this.quotaMax;
    }

    String getNom() {
        return this.personne.getNom();
    }


}
