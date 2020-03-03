package dev.neyerdavid;

public abstract class Getraenk {
    String beschreibung = "unbekanntes Getraenk";

    public String getBeschreibung() {
        return beschreibung;
    }

    public abstract double preis();

}
