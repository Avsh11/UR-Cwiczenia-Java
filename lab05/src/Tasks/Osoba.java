package Tasks;
import InputData.InputData;
// Zadanie 1 - Utwórz klasę Osoba zawierającą pola imię nazwisko oraz wiek, konstruktor z 3 parametrami, dwoma
//(imię i wiek) oraz konstruktor bezparametrowy. Napisz metodę pokazDane() wypisującą dane osoby.
//Następnie utwórz klasę DaneOsobe w której utworzysz 3 obiekty i klasy Osoba oraz wywołasz
//odpowiednie metody i zainicjalizujesz odpowiednie pola.

public class Osoba
{
    private String firstname, lastname;
    private int age;

    public Osoba(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Osoba(String firstname, int age) {
        this.firstname = firstname;
        this.age = age;
    }

    public void viewData()
    {
        System.out.println("Imie: "+firstname+" Nazwisko: "+lastname+" Wiek: "+age);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
} // Koniec klasy osoba
