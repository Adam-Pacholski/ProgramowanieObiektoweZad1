


public class Main {
    public static void main(String[] args) {

        Samochod s1 = new Samochod("Syrena", "105", 2, 800, 7.6,"ZGL1221");
        Samochod s2 = new Samochod("Fiat", "126p", 2, 650, 6.0,"VEC AP856");
        Samochod s3 = new Samochod("Volkswagen","Passat B7",5,2000,8.5,"VEC JP166");
        Samochod s4 = new Samochod("Ford","Mustang", 3,5,20.0,"E1 KACZOR");

        // Testy klasy Osoba

        // Sprawdzenie czy działają konstruktory

        // konstruktor domyślmy

        System.out.println("\nTEST 1");
        Osoba o1 = new Osoba();

        o1.wypiszInfo();

        // Ustawianie wartości
        System.out.println("\nTEST 2");
        o1.setImie("Joanna");
        o1.setNazwisko("Pacholski");
        o1.setAdres("Stokrotkowa 12, Poziomkowo");
        o1.dodajSamochod(s1.getNumerRejestracyjny());
        o1.dodajSamochod(s3.getNumerRejestracyjny());
        o1.wypiszInfo();
        System.out.println("\nTEST 3");
        // sprawdzania działania wyjąktu
        o1.usunSamochod("ASIA 123");
        o1.dodajSamochod(s1.getNumerRejestracyjny());
        // zwykłe dodanie samochodu aby wypełnić całą tablicę
        o1.dodajSamochod(s2.getNumerRejestracyjny());
        // Sprawdzanie wyjąktu przepełnienia tablicy nrRejestracyjne
        o1.dodajSamochod(s4.getNumerRejestracyjny());
        o1.wypiszInfo();


        // konstruktor przyjmujący parametry
        System.out.println("\nTEST 4");
        Osoba o2 = new Osoba("Adam","Pacholski","Am Bahndamm 10, 26197 Grossenkneten",3);

        // Dodanie samochodow
        o2.dodajSamochod(s4.getNumerRejestracyjny());
        o2.dodajSamochod(s3.getNumerRejestracyjny());
        o2.dodajSamochod(s2.getNumerRejestracyjny());
        o2.wypiszInfo();
        System.out.println("\nTEST 5");
        // Sprawdzanie wyjatku podczas usuwania wiekszej ilości samochodów
        o2.usunSamochod(s4.getNumerRejestracyjny());
        o2.usunSamochod(s3.getNumerRejestracyjny());
        o2.usunSamochod(s2.getNumerRejestracyjny());
        o2.usunSamochod(s1.getNumerRejestracyjny());
        o2.wypiszInfo();

        System.out.println("\nTEST 6");
        // proba dodania osoby z iloscia samochodow wieksza niz 3
        Osoba o3 = new Osoba("Adam","Pacholski","Am Bahndamm 10, 26197 Grossenkneten",4);
    }
}

