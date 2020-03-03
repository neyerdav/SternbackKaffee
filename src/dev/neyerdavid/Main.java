package dev.neyerdavid;

public class Main {

    public static void main(String[] args) {
	Getraenk getraenk = new Expresso();
	System.out.println(getraenk.getBeschreibung() + " " + getraenk.preis() + " Euro");

	Getraenk getraenk1 = new DunkleRoestung();
	getraenk1 = new  Schoko(getraenk1);
	getraenk1 = new Schoko(getraenk1);
	getraenk1 = new Milchschaum(getraenk1);
	System.out.println(getraenk1.getBeschreibung() + " " + getraenk1.preis() + " Euro");

	Getraenk getraenk2 = new Hausmischung();
	getraenk2 = new Soja(getraenk2);
	getraenk2 = new Milchschaum(getraenk2);
	System.out.println(getraenk2.getBeschreibung() + " " + getraenk2.preis() + " Euro");
    }
}
