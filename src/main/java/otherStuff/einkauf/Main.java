package otherStuff.einkauf;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Person joeggu = new Mitbewohner();
        joeggu.setVorname("Dario");
        joeggu.setNachname("Carosella");
        joeggu.setAge(26);

        Einkaufsliste einkaufsliste = new Einkaufsliste();
        einkaufsliste.setErfasser(joeggu);
        einkaufsliste.setDatum(new Date());

        Artikel pizza = new Lebensmittel();
        pizza.setDatum(new Date());
        pizza.setPreis(10);
        pizza.setMenge(500);
        pizza.setBeschreibung("Piiiiiiiizza!");
        pizza.setName("Pizza");
        pizza.setBearbeiter(joeggu);
        pizza.setErfasser(joeggu);
        pizza.setRegelmässigkeit(Regelmässigkeit.TÄGLICH);

        Artikel cola = new Lebensmittel();
        cola.setDatum(new Date());
        cola.setPreis(2);
        cola.setMenge(1000);
        cola.setBeschreibung("Coci!");
        cola.setName("CocaCola");
        cola.setBearbeiter(joeggu);
        cola.setErfasser(joeggu);
        cola.setRegelmässigkeit(Regelmässigkeit.WÖCHENTLICH);

        Artikel chips = new Lebensmittel();
        chips.setDatum(new Date());
        chips.setPreis(3);
        chips.setMenge(100);
        chips.setBeschreibung("Zweifel chips!");
        chips.setName("Chips");
        chips.setBearbeiter(joeggu);
        chips.setErfasser(joeggu);
        chips.setRegelmässigkeit(Regelmässigkeit.MONATLICH);

        Artikel ajax = new Reinigungsmittel();
        ajax.setDatum(new Date());
        ajax.setPreis(500);
        ajax.setMenge(2);
        ajax.setBeschreibung("Ajax Allzweckreiniger!");
        ajax.setName("Ajax");
        ajax.setBearbeiter(joeggu);
        ajax.setErfasser(joeggu);
        ajax.setRegelmässigkeit(Regelmässigkeit.JÄHRLICH);

        einkaufsliste.artikelHinzufügen(pizza);
        einkaufsliste.artikelHinzufügen(cola);
        einkaufsliste.artikelHinzufügen(chips);
        einkaufsliste.artikelHinzufügen(ajax);

        einkaufsliste.tätigeeinkauf(joeggu, pizza, 40, 8);

        System.out.println(einkaufsliste);
    }
}
