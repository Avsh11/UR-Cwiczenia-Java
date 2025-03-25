package Files;
// 4. Klasa SamochodOsobowy dziedziczy po klasie Samochod.
public class SamochodOsobowy extends Samochod
{
    // SamochodOsobowy: Waga (powinna być z przedziału 2 t – 4,5 t),
    // Pojemność silnika (powinna być z
    //przedziału 0,8-3,0), Ilość osób

    // Klasa SamochodOsobowy dziedziczy po klasie Samochod.

    private double Waga;
    private double Pojemnosc_silnika;
    private int Ilosc_osob;

    public void setWaga(double weight)
    {
        if (weight < 2.0 || weight > 4.5)
        {
            System.out.println("Niepoprawana waga.");
            this.Waga = 2.0;
        }
        else
        {
            this.Waga = weight;
        }
    }

    public void setSilnik(double engine)
    {
        if(engine < 0.8 || engine > 3.0)
        {
            System.out.println("Niepoprawana pojemnosc silnika.");
            this.Pojemnosc_silnika = 0.8;
        }
        else
        {
            this.Pojemnosc_silnika = engine;
        }
    }

    // Konstruktor do danych uzytkownika


    public SamochodOsobowy()
    {
        super(); // Wywoła się konstruktor z samochodów, zawsze na samej górze
        InputData inputData = new InputData();
        System.out.println("Podaj wagę: ");
        this.Waga = inputData.InputDouble();
        System.out.println("Podaj pojemnosc silnika: ");
        this.Pojemnosc_silnika = inputData.InputDouble();
        System.out.println("Podaj ilość osób: ");
        this.Ilosc_osob = inputData.InputInt();
    }

    @Override
    public void Informacje() {
        super.Informacje();
        System.out.println("Waga: " + Waga);
        System.out.println("Pojemność silnika: "+Pojemnosc_silnika);
        System.out.println("Ilosc osob: " + Ilosc_osob);
    }
} // Koniec klasy SamochodOsobowy
