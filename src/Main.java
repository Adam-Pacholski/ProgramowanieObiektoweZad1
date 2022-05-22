import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Samochod s1 = new Samochod("Syrena", "105", 2, 800, 7.6,"ZGL1221");
        Samochod s2 = new Samochod("Fiat", "126p", 2, 650, 6.0,"VEC AP856");
        Samochod s3 = new Samochod("Volkswagen","Passat B7",5,2000,8.5,"VEC JP166");
        Garaz g1 = new Garaz();
        g1.setAdres("ul. Garażowa 1");
        g1.setPojemnosc(1);

        Garaz g2 = new Garaz("ul. Garażowa 2", 2);

        Osoba o1 = new Osoba("Adam","Pacholski","Am Bahndamm 10",3);
        o1.dodajSamochod(s1.getNumerRejestracyjny());
        o1.dodajSamochod(s2.getNumerRejestracyjny());
        o1.dodajSamochod(s3.getNumerRejestracyjny());
//        o1.dodajSamochod("Z DUPY");
        o1.usunSamochod("dsdsdffsf");
        o1.usunSamochod(s3.getNumerRejestracyjny());
        o1.usunSamochod(s1.getNumerRejestracyjny());
        o1.usunSamochod(s2.getNumerRejestracyjny());
        o1.usunSamochod(s2.getNumerRejestracyjny());

        o1.wypiszInfo();

    }
}

