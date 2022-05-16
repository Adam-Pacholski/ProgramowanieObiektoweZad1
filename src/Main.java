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

        g1.wprowadzSamochod(s1);
//        g1.wypiszInfo();
//        g1.wprowadzSamochod(s2);

        g2.wprowadzSamochod(s1);
        g2.wprowadzSamochod(s2);
        g2.wypiszInfo();
        g2.wyprowadzSamochod();
        g2.wyprowadzSamochod();
        g2.wyprowadzSamochod();

        Osoba o1 = new Osoba();
        o1.wypiszInfo();

    }
}

