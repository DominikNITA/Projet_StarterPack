package et3.java.projet.models;

public class DocumentEntry {
    private Document document;
    private int quantity;

    public DocumentEntry(Document document, int quantity) {
        this.document = document;
        this.quantity = quantity;
    }

    public Document getDocument() {
        return document;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean retournerDocument(){
        quantity++;
        return true;
    }

    public boolean emprunterDocument(){
        if(quantity > 0){
            quantity--;
            return true;
        }
        return false;
    }
}
