import java.util.Objects;

public class Osoba {

    private String imie;
    private String nazwisko;

    private String adres;
    private String[] numeryRejestracyjne;
    private Integer iloscSamochodow = 0;


    // Konstruktory

    // Konstruktor domyślny z automatu tworzy miejsce na 3 samochody
    public Osoba() {
        this.imie = "nieznane";
        this.nazwisko = "nieznane";
        this.adres = "nieznany";
        this.numeryRejestracyjne = new String[3];
        System.out.println("Nowa osoba dodana");

    }

    public Osoba(String imie, String nazwisko, String adres, Integer iloscSamochodow) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;

        if (iloscSamochodow <= 3) {
            this.numeryRejestracyjne = new String[iloscSamochodow];
            System.out.println("Nowa osoba dodana");
        } else {
            System.out.println("Nie mozma dodac nowej osoby, poniewaz nie mozna miec wiecej niz 3 auta");
            //System.exit(0);
        }
    }

    // Metody

    public void dodajSamochod(String nrRejestracyjny) {

        boolean istnieje = false;

        for (String s : this.numeryRejestracyjne) {
            if (Objects.equals(s, nrRejestracyjny)) {
                System.out.println("Nie moga byc dwa samochody o tych samych numerach rejestracyjnych");
                istnieje = true;
                break;
            }
        }

        if (!istnieje) {
            if (this.iloscSamochodow < this.numeryRejestracyjne.length) {

                // Dodanie tablic na pierwsze wolne miejsce
                for (int i = 0; i < this.numeryRejestracyjne.length; i++) {
                    if (numeryRejestracyjne[i] == null) {
                        this.numeryRejestracyjne[i] = nrRejestracyjny;
                        System.out.println("Dodano samochod o nr rejestracyjnym: " + nrRejestracyjny);
                        this.iloscSamochodow++;
                        break;
                    }
                }
            } else {
                System.out.println("Nie mozna dodać więcej samochodów");
            }
        }
    }

    public void usunSamochod(String nrRejestracyjny) {

        if (iloscSamochodow == 0) {
            System.out.println("Nie mozna usunac wiecej samochodow, poniewaz aktualnie osoba nie posiada samochodów");
        } else {
            for (int i = 0; i < this.numeryRejestracyjne.length; i++) {
                if (Objects.equals(this.numeryRejestracyjne[i], nrRejestracyjny)) {
                    this.numeryRejestracyjne[i] = null;
                    System.out.println("Usunieto samochod o nr rejestracyjnym: " + nrRejestracyjny);

                    this.iloscSamochodow--;
                    break;
                } else if (i == this.numeryRejestracyjne.length - 1) {
                    System.out.println("Nie znaleziono samochodu o numerze rejestracyjnym: " + nrRejestracyjny);
                }
            }
        }
    }

    public void wypiszInfo() {
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("Imię: " + getImie());
        System.out.println("Nazwisko: " + getNazwisko());
        System.out.println("Adres: " + getAdres());
        System.out.println("Numery tablic rejestracyjnych posiadanych samochodów:");

        if(this.iloscSamochodow == 0){
            System.out.println("Brak");
        }
        else
        {
            for (String s : this.numeryRejestracyjne) {
                if (s != null) {
                    System.out.println("- " + s);
                }
            }
        }

        System.out.println("Aktualna liczba posiadanych samochodow: " + this.iloscSamochodow);
    }

    // Gettery i settery

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
