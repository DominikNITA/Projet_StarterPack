package et3.java.projet.models;

import java.util.ArrayList;

public class Reseau {
    ArrayList<Bibliotheque> bibliotheques;

    public Reseau() {
        bibliotheques = new ArrayList<Bibliotheque>();
    }

    public void ajouterBibliotheque(Bibliotheque bibliotheque){
        bibliotheques.add(bibliotheque);
    }

    public void ajouterUtilisateur(String nom, Bibliotheque bibliotheque){

    }

    public boolean ajouterDocument(Document document, int quantite, String bibliothequeName){
        if(quantite == 0){
            return false;
        }
        for (Bibliotheque bibliotheque: bibliotheques
             ) {
            if(bibliotheque.getNom().equals(bibliothequeName)){
                return bibliotheque.ajouterDocument(document,quantite);
            }
        }
        return false;
    }
}
