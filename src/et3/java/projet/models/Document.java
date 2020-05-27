package et3.java.projet.models;

import java.util.Date;

public abstract class Document {
    protected String ean;
    public String titre;
    protected String publisher;
    protected int date;
    protected String auteurPrenom;
    protected String auteurNom;
    protected Serie serieDetails;

    public Document(String ean, String titre, String publisher, int date, String auteurPrenom, String auteurNom, Serie serieDetails) {
        this.ean = ean;
        this.titre = titre;
        this.publisher = publisher;
        this.date = date;
        this.auteurPrenom = auteurPrenom;
        this.auteurNom = auteurNom;
        this.serieDetails = serieDetails;
    }

    @Override
    public String toString() {
        return "Document{" +
                "ean='" + ean + '\'' +
                ", titre='" + titre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", date=" + date +
                ", auteurPrenom='" + auteurPrenom + '\'' +
                ", auteurNom='" + auteurNom + '\'' +
                ", serieDetails=" + serieDetails +
                '}';
    }
}
