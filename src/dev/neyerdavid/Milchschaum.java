package dev.neyerdavid;

public class Milchschaum extends ZutatDekorierer {
    Getraenk getraenk;

    public Milchschaum(Getraenk getraenk) {
        this.getraenk = getraenk;
    }

    public String getBeschreibung() {
        return getraenk.getBeschreibung() + ", Milschschaum";
    }

    public double preis() {
        return .15 + getraenk.preis();
    }
}
