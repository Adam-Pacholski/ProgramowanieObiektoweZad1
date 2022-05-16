public class Osoba {

    private String imie;
    private String nazwisko;

    private String adres;
    private String[] numeryRejestracyjne;
    private Integer iloscSamochodow = 0;

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
        this.iloscSamochodow = iloscSamochodow;
        this.numeryRejestracyjne = new String[3];
    }

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

    public void wypiszInfo(){
        for (String s : this.numeryRejestracyjne) {
            System.out.println(s);
        }
    }


}
