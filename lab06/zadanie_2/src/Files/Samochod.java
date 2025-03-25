package Files;

import java.util.Scanner;

public class Samochod
{
    // Samochod: Marka, Model, Nadwozie, Kolor, Rok produkcji, Przebieg (nie może być ujemny)
    private String Marka;
    private String Model;
    private String Nadwozie;
    private String Kolor;
    private int Rok_produkcji;
    private int Przebieg; // Nie może być ujemny

    // Gettery settery zawsze na public ! ! !

    public void setPrzebieg(int Przebieg)
    {
        if(Przebieg < 0)
        {
            System.out.println("Przebieg nie może być ujemny.");
            this.Przebieg = 0;
        }
        else
        {
            this.Przebieg = Przebieg;
        }
    }

    // Konstruktor do danych

    public Samochod()
    {
        InputData inputData = new InputData();
        System.out.println("Podaj nazwę modelu: ");
        this.Model = inputData.InputString();
        System.out.println("Podaj typ nadwozia: ");
        this.Nadwozie = inputData.InputString();
        System.out.println("Podaj kolor: ");
        this.Kolor = inputData.InputString();
        System.out.println("Podaj Rok produkcji: ");
        this.Rok_produkcji = inputData.InputInt();
        System.out.println("Podaj Przebieg: ");
        this.Przebieg = inputData.InputInt();
    }

    public Samochod(String marka, String model, String nadwozie, String kolor, int rok_produkcji, int przebieg) {
        Marka = marka;
        Model = model;
        Nadwozie = nadwozie;
        Kolor = kolor;
        Rok_produkcji = rok_produkcji;
        Przebieg = przebieg;
    }

    // Przesłoń = Override

    public void Informacje()
    {
        System.out.println("Marka: " + Marka);
        System.out.println("Model: " + Model);
        System.out.println("Nadwozie: " + Nadwozie);
        System.out.println("Kolor: " + Kolor);
        System.out.println("Rok_produkcji: " + Rok_produkcji);
        System.out.println("Przebieg: " + Przebieg);
    }
} // Koniec klasy Samochod
