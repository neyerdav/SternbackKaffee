package dev.neyerdavid;

public class Soja extends ZutatDekorierer {
    Getraenk getraenk;

    public Soja(Getraenk getraenk) {
        this.getraenk = getraenk;
    }

    public String getBeschreibung() {
        return getraenk.getBeschreibung() + ", Soja";
    }

    public double preis() {
        return .20 + getraenk.preis();
    }
}
