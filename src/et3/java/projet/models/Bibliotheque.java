package et3.java.projet.models;

import java.util.ArrayList;

public class Bibliotheque {
    private String nom;
    private ArrayList<DocumentEntry> documents;

    public Bibliotheque(String nom) {
        this.nom = nom;
        this.documents = new ArrayList<>();
    }

    public String getNom() {
        return this.nom;
    }

    public boolean ajouterDocument(Document doc, int quantite) {
        //TODO: Check if doc is not already in documents
        documents.add(new DocumentEntry(doc, quantite));
        System.out.println("Added one document to " + getNom() + ", quantity=" + quantite + ", document:" + doc);
        return true;
    }

    public boolean ajouterUtilisateur(String nom, Bibliotheque bib) {
        //TO DO
        return true;
    }

    public boolean emprunterDocument(Utilisateur utilisateur, Document document) {
        //TO DO
        return true;
    }

    public boolean rendreDocument(Utilisateur utilisateur, Document doc) {
        //TO DO
        return true;
    }
}