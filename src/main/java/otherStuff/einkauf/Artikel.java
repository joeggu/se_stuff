package otherStuff.einkauf;

import java.util.Date;

public abstract class Artikel {

    private int menge;
    private int preis;
    private Date datum;
    private Person erfasser;
    private Person bearbeiter;
    private Regelmässigkeit regelmässigkeit;

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Person getErfasser() {
        return erfasser;
    }

    public void setErfasser(Person erfasser) {
        this.erfasser = erfasser;
    }

    public Person getBearbeiter() {
        return bearbeiter;
    }

    public void setBearbeiter(Person bearbeiter) {
        this.bearbeiter = bearbeiter;
    }

    public Regelmässigkeit getRegelmässigkeit() {
        return regelmässigkeit;
    }

    public void setRegelmässigkeit(Regelmässigkeit regelmässigkeit) {
        this.regelmässigkeit = regelmässigkeit;
    }

    public abstract void setName(String name);
    public abstract String getName();

    public abstract void setBeschreibung(String beschreibung);
    public abstract String getBeschreibung();
}
