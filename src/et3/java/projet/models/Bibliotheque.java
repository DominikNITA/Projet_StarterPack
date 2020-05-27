package et3.java.projet.models;

import java.util.ArrayList;

public class Bibliotheque {
    private String nom;
    private ArrayList<DocumentEntry> documents;
    private ArrayList<Utilisateur> utilisateurList;

    public Bibliotheque(String nom) {
        this.nom = nom;
        this.documents = new ArrayList<>();
    }

    public String getNom() {
        return this.nom;
    }

    public boolean ajouterDocument(Document doc, int quantite) {
        //TODO: Check if doc is not already in documents
        if(this.documents.contains(doc)){
            System.out.println(doc + "exist in the list");
        }else {
            documents.add(new DocumentEntry(doc, quantite));
            System.out.println("Added one document to " + getNom() + ", quantity=" + quantite + ", document:" + doc);
        }
        return true;
    }

    public boolean ajouterUtilisateur(Utilisateur utilisateur) {
        this.utilisateurList.add(utilisateur);
        return true;
    }

    public boolean emprunterDocument(Utilisateur utilisateur, Document document) {
        if(utilisateur.getQuotaMax() > utilisateur.getListeEmprunt().size()){
            utilisateur.ajoutDocument(document);
            document.estEmprunte();
        }
        else{
            System.out.println("Vous avez dépassé le quota max !");
        }
        return true;
    }

    public boolean rendreDocument(Utilisateur utilisateur, Document doc) {
        utilisateur.enleverDocument(doc);
        return true;
    }
    
}