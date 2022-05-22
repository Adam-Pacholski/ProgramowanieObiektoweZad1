import java.util.Objects;

public class Osoba {

    private String imie;
    private String nazwisko;

    private String adres;
    private String[] numeryRejestracyjne;
    private Integer iloscSamochodow = 0;


    // Konstruktory

    public Osoba() {
        this.imie = "nieznane";
        this.nazwisko = "nieznane";
        this.adres = "nieznany";
        this.numeryRejestracyjne = new String[3];

    }

    public Osoba(String imie, String nazwisko, String adres, Integer iloscSamochodow) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;

        if (iloscSamochodow <= 3) {
            this.numeryRejestracyjne = new String[iloscSamochodow];
        } else {
            System.out.println("Nie mozma miec wiecej niz 3 auta");
            System.exit(0);
        }

    }

    // Metody

    public void dodajSamochod(String nrRejestracyjny) {
        if (this.iloscSamochodow < this.numeryRejestracyjne.length) {

            // Dodanie tablic na pierwsze wolne miejsce
            for (int i = 0; i < this.numeryRejestracyjne.length; i++) {
                if (numeryRejestracyjne[i] == null) {
                    this.numeryRejestracyjne[i] = nrRejestracyjny;
                    this.iloscSamochodow++;
                    break;
                }
            }
        } else {
            System.out.println("Nie mozna dodać więcej samochodów");
        }
    }

    public void usunSamochod(String nrRejestracyjny) {

        if (iloscSamochodow == 0) {
            System.out.println("Aktualnie osoba ta nie posiada samochodów");
        } else {
            for (int i = 0; i < this.numeryRejestracyjne.length; i++) {
                if (Objects.equals(this.numeryRejestracyjne[i], nrRejestracyjny)) {
                    this.numeryRejestracyjne[i] = null;
                    this.iloscSamochodow--;
                    break;
                } else if (i == this.numeryRejestracyjne.length - 1) {
                    System.out.println("Nie znaleziono samochodu o numerze rejestracyjnym: " + nrRejestracyjny);
                }
            }
        }
    }

    public void wypiszInfo() {
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("Imię: " + getImie());
        System.out.println("Nazwisko: " + getNazwisko());
        System.out.println("Adres: " + getAdres());
        System.out.println("Numery tablic rejestracyjnych posiadanych samochodów:");

        for (String s : this.numeryRejestracyjne) {
           if(s!=null) {
               System.out.println("- " + s);
           }
        }
//        System.out.println();
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
