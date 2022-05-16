public class Garaz {

    private String adres;
    private Integer pojemnosc;
    private int liczbaSamochodow = 0;
    private Samochod[] samochody;

    // construktory

    public Garaz() {
        this.adres = "nieznany";
        this.pojemnosc = 0;
        this.samochody = null;
    }

    public Garaz(String adres, Integer pojemnosc) {
        this.adres = adres;
        this.pojemnosc = pojemnosc;
        this.samochody = new Samochod[pojemnosc];
    }

    // metody

    public void wprowadzSamochod(Samochod samochod) {
        if (this.liczbaSamochodow == this.pojemnosc) {
            System.out.println("Garaż jest już pełny");
        } else {
            this.samochody[this.liczbaSamochodow] = samochod;
            this.liczbaSamochodow++;
        }
    }

    public void wyprowadzSamochod() {
        if (this.liczbaSamochodow == 0) {
            System.out.println("Brak samochodów w garażu");
        } else {
            this.samochody[this.liczbaSamochodow - 1] = null;
            liczbaSamochodow--;
        }
    }

    public void wypiszInfo() {

        for (int i = 1; i <= liczbaSamochodow; i++) {
            System.out.println("Samochód na miejscu parkingowym numer " + i + ": " );
            samochody[i-1].wypiszInfo();
        }
    }

    //getter and setter

    public Integer getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(Integer pojemnosc) {
        this.pojemnosc = pojemnosc;
        this.samochody = new Samochod[pojemnosc];
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

}
