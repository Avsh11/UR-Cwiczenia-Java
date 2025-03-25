import Files.Samochod;
import Files.SamochodOsobowy;

public class Main
{
    public static void main(String[] args)
    {
        SamochodOsobowy samochodOsobowy = new SamochodOsobowy();
        Samochod samochod_1 = new Samochod();
        Samochod samochod_2 = new Samochod("Volvo","V40","Sedan","Czarny",1996,120000);

        // Informacje o samochodach

        samochod_1.Informacje();
        samochod_2.Informacje();
        samochodOsobowy.Informacje();
    }
}

// 1. Napisz program, w którym będą dwie klasy: Samochod i SamochodOsobowy. W klasach tych powinny
//znajdować się następujące pola:

// 2. Samochod: Marka, Model, Nadwozie, Kolor, Rok produkcji, Przebieg (nie może być ujemny)

// 3. SamochodOsobowy: Waga (powinna być z przedziału 2 t – 4,5 t), Pojemność silnika (powinna być z
//przedziału 0,8-3,0), Ilość osób

// 4. Klasa SamochodOsobowy dziedziczy po klasie Samochod.

// 5. W obydwu klasach utwórz konstruktor,
//który pobierze dane od użytkownika.

// 6.  Dodatkowo w klasie Samochod przeciąż konstruktor w taki
//sposób, by wartości pól były parametrami metody.

// 7. W klasie Samochod utwórz także metodę, która
//wyświetli informacje o samochodzie. Przesłoń ją w klasie SamochodOsobowy.

// 8. W metodzie Main()
//utwórz obiekt klasy SamochodOsobowy oraz dwa obiekty klasy Samochod (wykorzystując różne
//konstruktory). Wyświetl informacje o samochodach.