package et3.java.projet.models;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {

    private String id;
    private Integer quotaMax;
    private Personne personne;
    private ArrayList<Document> docList;
    public Utilisateur(String id, Integer quotaMax, Personne personne) {
        this.id = id;
        this.quotaMax = quotaMax;
        this.personne = personne;
    }

    public Integer getQuotaMax() {
        return this.quotaMax;
    }

    public String getNom() {
        return this.personne.getNom();
    }

    public List<Document> getListeEmprunt(){
        return this.docList;
    }

    public void ajoutDocument(Document doc){
        this.docList.add(doc);
    }

    public void enleverDocument(Document doc){
        if(docList.contains(doc)) {
            this.docList.remove(doc);
        }else{
            System.out.println("Le document n'existe pas dans la liste");
        }
    }

    ArrayList<Document> getDocuments(Utilisateur utilisateur){
        return docList;
    }
}
