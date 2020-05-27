package et3.java.projet.models;

import java.util.Date;

public class CD extends Document{
    public CD(String ean, String titre, String publisher, int date, String auteurPrenom, String auteurNom, Serie serieDetails) {
        super(ean, titre, publisher, date, auteurPrenom, auteurNom, serieDetails);
    }
}
