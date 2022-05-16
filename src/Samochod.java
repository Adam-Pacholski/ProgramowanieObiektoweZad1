public class Samochod {

    private String marka;
    private String model;
    private Integer iloscDrzwi;
    private Integer pojemnoscSilnika;
    private double srednieSpalanie;
    private String numerRejestracyjny;
    private static Integer iloscSamochodow = 0;

    // Konstruktory
    public Samochod() {
        this.marka = "nieznana";
        this.model = "nieznany";
        this.iloscDrzwi = 0;
        this.pojemnoscSilnika = 0;
        this.srednieSpalanie = 0.0;
        this.numerRejestracyjny = "nieznany";
        this.iloscSamochodow++;
    }

    public Samochod(String marka_, String model_, Integer iloscDrzwi_, Integer pojemnoscSilnika_, double srednieSpalanie_, String numerRejestracyjny) {
        this.marka = marka_;
        this.model = model_;
        this.iloscDrzwi = iloscDrzwi_;
        this.pojemnoscSilnika = pojemnoscSilnika_;
        this.srednieSpalanie = srednieSpalanie_;
        this.numerRejestracyjny = numerRejestracyjny;
        this.iloscSamochodow++;
    }

    // Gettery i settery

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getIloscDrzwi() {
        return iloscDrzwi;
    }

    public void setIloscDrzwi(Integer iloscDrzwi) {
        this.iloscDrzwi = iloscDrzwi;
    }

    public Integer getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(Integer pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public double getSrednieSpalanie() {
        return srednieSpalanie;
    }
    public void setSrednieSpalanie(double srednieSpalanie) {
        this.srednieSpalanie = srednieSpalanie;
    }

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }

    public void setNumerRejestracyjny(String numerRejestracyjny) {
        this.numerRejestracyjny = numerRejestracyjny;
    }

    // Metody
    public void wypiszInfo(){
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Ilość drzwi: " + iloscDrzwi);
        System.out.println("Pojemność silnika: " + pojemnoscSilnika);
        System.out.println("Średnie spalanie: " + srednieSpalanie);
        System.out.println("------------------------");
    }

    private double obliczSpalanie(double dlugoscTrasy){
        double spalanie = (this.srednieSpalanie * dlugoscTrasy)/100;
        return spalanie;
    }
    public double ObliczKosztPrzjazdu(double dlugoscTrasy, double cenaPaliwa){
        double kosztPrzejazdu = obliczSpalanie(dlugoscTrasy)*cenaPaliwa;
        return kosztPrzejazdu;
    }
    public static void wypiszIloscSamochodow(){
        System.out.println("Ilość samochodów: " + iloscSamochodow);
    }
}
