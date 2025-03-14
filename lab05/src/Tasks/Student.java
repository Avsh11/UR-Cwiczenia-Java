package Tasks;
import InputData.InputData;
import java.util.Scanner;
// Zadanie 2 - Na podstawie zadania poprzedniego utwórz klasę Student, która posiada następujące pola: imię,
//nazwisko, nr_indeksu, nazwa specjalności, rok_studiow. Dla pól dobierz odpowiedni typ danych.
//Utwórz cztery przeciążenia konstruktorów dla tej klasy (każda wersja konstruktora powinna
//przyjmować przynajmniej jeden parametr - nie tworzyć konstruktora pustego). Utwórz metodę
//wyświetlającą dane o studencie. Utwórz cztery obiekty klasy student, każdy korzystający z innego
//przeciążenia konstruktora podczas tworzenia obiektu. Dla każdego obiektu uruchom metodę
//wyświetlającą dane.

public class Student
{
    private Osoba osoba;
    private int nrAlbumu;
    private String kierunek;
    private String specjalnosc;
    private int rokStudiow;

    // Kompozycja
    // Student ma imie naziwsko wiek i dodatkowo to co powyzej.
    // Poprzez obiekt osoba mam dostep do elementow w klasie osoba.
    // Co to jest diagram klas - ważne.
    // Plugin UML generator.

    // DANE BEZ PERSON DANE BEZ PERSON (ale z domyślnymi danymi bez null)
    public Student(int nrAlbumu, String kierunek, String specjalnosc, int rokStudiow) {
        this(new Osoba("Nieznane","Nieznane",0),nrAlbumu,kierunek,specjalnosc,rokStudiow);
        this.nrAlbumu = nrAlbumu;
        this.kierunek = kierunek;
        this.specjalnosc = specjalnosc;
        this.rokStudiow = rokStudiow;
    }
    // DANE BEZ PERSON DANE BEZ PERSON (ale z domyślnymi danymi bez null)

    // PEŁNE DANE PEŁNE DANE
    public Student(Osoba osoba, int nrAlbumu, String kierunek, String specjalnosc, int rokStudiow) {
        this.osoba = osoba;
        this.nrAlbumu = nrAlbumu;
        this.kierunek = kierunek;
        this.specjalnosc = specjalnosc;
        this.rokStudiow = rokStudiow;
    }
    // PEŁNE DANE PEŁNE DANE

    // DANE BEZ SPECJALNOŚĆI DANE BEZ SPECJALNOŚĆI I ROKU
    public Student(Osoba osoba, int nrAlbumu, String kierunek) {
        this.osoba = osoba;
        this.nrAlbumu = nrAlbumu;
        this.kierunek = kierunek;
    }
    // DANE BEZ SPECJALNOŚĆI DANE BEZ SPECJALNOŚĆI I ROKU

    // DANE BEZ NR ALBUMU I ROKU DANE BEZ NR ALBUMU I ROKU
    public Student(Osoba osoba, String kierunek, String specjalnosc) {

        this.osoba = osoba;
        this.kierunek = kierunek;
        this.specjalnosc = specjalnosc;
        this.rokStudiow = 1;
        this.nrAlbumu = nrAlbumu;
    }
    // DANE BEZ NR ALBUMU I ROKU DANE BEZ NR ALBUMU I ROKU

    public void viewData()
    {
        if(osoba != null)
        {
            osoba.viewData();
        }
        else
        {
            System.out.println("Brak danych osobowych");
        }



        System.out.println(
                "Nr albumu: " + nrAlbumu +
                " Kierunek: " + kierunek +
                " Specjalnosc: " + specjalnosc +
                " Rok studiow: " + rokStudiow);
    }

    public void Dane()
    {
        InputData inputData = new InputData();
        System.out.println("Podaj imie: ");
        osoba.setFirstname(inputData.InputString());
        System.out.println("Podaj nazwisko: ");
        osoba.setLastname(inputData.InputString());
        System.out.println("Podaj wiek: ");
        osoba.setAge(inputData.InputInt());
        System.out.println("Podaj nr albumu: ");
        nrAlbumu = inputData.InputInt();
        System.out.println("Podaj kierunek: ");
        kierunek = inputData.InputString();
        System.out.println("Podaj specjalnosc: ");
        specjalnosc = inputData.InputString();
        System.out.println("Podaj rok studiow: ");
        rokStudiow = inputData.InputInt();
    }

} // Koniec klasy student
