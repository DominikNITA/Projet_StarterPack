package et3.java.projet.models;

import java.util.Date;

public class Partition extends Document{
    public Partition(String ean, String titre, String publisher, int date, String auteurPrenom, String auteurNom, int quantiteDisponible, Serie serieDetails) {
        super(ean, titre, publisher, date, auteurPrenom, auteurNom, serieDetails);
    }
}
