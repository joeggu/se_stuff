package otherStuff.einkauf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Einkaufsliste {

    private List<Artikel> artikelList = new ArrayList<>();
    private Person erfasser;
    private Date datum;

    public List<Artikel> getArtikelList() {
        return artikelList;
    }

    public void artikelHinzufügen(Artikel artikel) {
        this.artikelList.add(artikel);
    }

    public Person getErfasser() {
        return erfasser;
    }

    public void setErfasser(Person erfasser) {
        this.erfasser = erfasser;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public void sortKategorie(Artikel artikel){
        artikelList.stream().sorted((a1, a2) -> a1.getName().compareTo(a2.getName())).forEach(p -> System.out.println(p.getName() + p.getBeschreibung() + p.getMenge() + p.getPreis()));
    }

    public void searchKategorie(Artikel artikel){

    }

    public void tätigeeinkauf(Person einkäufer , Artikel artikel, int menge, int preis){
        artikel.setMenge(menge);
        artikel.setPreis(preis);
        artikel.setDatum(new Date());
        artikel.setBearbeiter(einkäufer);
    }
}
