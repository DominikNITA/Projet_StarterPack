package et3.java.projet.models;

import java.util.ArrayList;
import java.util.List;

public class Personne {
    private String nom;

    public Personne(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void rendreDocument(Document doc) {
        //TO DO
    }

    List<Document> getDocuments(){
        //TO DO
        List<Document> list = new ArrayList<Document>();
        return list;
    }
}