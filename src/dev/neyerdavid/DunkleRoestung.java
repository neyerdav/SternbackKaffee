package dev.neyerdavid;

public class DunkleRoestung extends Getraenk {

    public DunkleRoestung() {
        beschreibung = "Dunkle Roestung";
    }

    @Override
    public double preis() {
        return 0.99;
    }
}
