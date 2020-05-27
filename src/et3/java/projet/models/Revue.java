package et3.java.projet.models;

import java.util.Date;

public class Revue extends Document {
    public Revue(String ean, String titre, String publisher, int date, String auteurPrenom, String auteurNom, Serie serieDetails) {
        super(ean, titre, publisher, date, auteurPrenom, auteurNom, serieDetails);
    }
}
