public class Libro {
    private String codice;
    private String titolo;
    private String autore;
    private double prezzo;
    private int pezzi;

//costruttori
    public Libro(String codice, String titolo, String autore, double prezzo, int pezzi){
        this.codice= codice;
        this.autore = autore;
        this.titolo = titolo;
        this.prezzo = prezzo;
        this.pezzi = pezzi;
    }
}
