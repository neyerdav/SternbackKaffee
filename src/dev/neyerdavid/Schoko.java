package dev.neyerdavid;

public class Schoko extends ZutatDekorierer {
    Getraenk getraenk;

    public Schoko(Getraenk getraenk) {
        this.getraenk = getraenk;
    }

    public String getBeschreibung() {
        return getraenk.getBeschreibung() + ", Schoko";
    }

    public double preis() {
        return .20 + getraenk.preis();
    }
}
