package otherStuff.einkauf;

public class Reinigungsmittel extends Artikel {

    private String name;
    private String beschreibung;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Override
    public String getBeschreibung() {
        return this.beschreibung;
    }
}
