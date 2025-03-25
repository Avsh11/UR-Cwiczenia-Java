package Pliki;
//10. Zaprojektować klasę Okrag zawierającą pola:
//oraz metody:

// 20. Zmodyfikować klasę Okrag zawierającą, tak, aby dziedziczyła po klasie Figura.
public class Okrag extends Figura
{
    //• środek klasy Punkt – środek okręgu,
    private Punkt srodek;
    //• promień typu double
    private double promien;
    //• getPowierzchnia() zwracająca pole powierzchni - double, pi razy promien^2 - pole p. okregu
    public double getPowierzchnia()
    {
        return Math.PI * (promien * promien);
    }
    //• getSrednica() zwracająca średnice
    public double getSrednica()
    {
        return 2 * promien;
    }
    //• setPromien(double p) ustawiająca nowy promień
    public void setPromien(double p)
    {
        if(p > 0)
        {
            this.promien = p;
        }
        else
        {
            System.out.println("Promien musi byc wiekszy od zera ! ! !");
        }
    }
    //• getPromien() zwracająca promień
    public double getPromien()
    {
        return promien;
    }
    //• wSrodku(Punkt) sprawdzająca czy dany punkt znajduje się wewnątrz okręgu. Skorzystaj ze
    //wzoru:
    // (x-a)^2 + (y-b)^2 <= r^2 , S = (a,b)
    public boolean wSrodku(Punkt p)
    {
        return Math.pow(p.x - srodek.x, 2) + Math.pow(p.y - srodek.y, 2) <= Math.pow(promien, 2);
    }

    //Konstruktory:
    //• Pusty – inicjujący pola wartościami domyślnymi punkt (0,0), promień 0,
    public Okrag()
    {
        this.srodek = new Punkt(0,0);
        this.promien = 0.0;
    }
    //• Określający punkt oraz promień
    public Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    public String opis() {
        return "Promień: " + promien + "\nSrodek: " + srodek + "\n";
    }
}
