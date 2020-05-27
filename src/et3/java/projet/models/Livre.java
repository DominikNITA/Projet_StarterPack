package et3.java.projet.models;

import java.util.Date;

public class Livre extends Document {
    protected String isbn;
    public Livre(String ean, String titre, String publisher, int date, String auteurPrenom, String auteurNom, Serie serieDetails, String isbn)
    {
        super(ean,titre,publisher,date,auteurPrenom,auteurNom,serieDetails);
        this.isbn = isbn;
    }
}
