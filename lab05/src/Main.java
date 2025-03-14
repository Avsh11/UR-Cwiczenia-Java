import Tasks.Osoba;
import Tasks.Student;
import Zadanie_4.zadanie_4;

public class Main
{
    public static void main(String[] args)
    {
        Osoba osoba = new Osoba("Jan", "Paweł", 70);
        Osoba osoba1 = new Osoba("Janusz","Tracz",60);
        Osoba osoba2 = new Osoba("Edward", "Gierek",50);
        Osoba osoba3 = new Osoba("Janusz",30);
//        osoba.viewData();
//        osoba1.viewData();
//        osoba2.viewData();
//        osoba3.viewData();

        Student student1 = new Student(osoba, 12345, "Informatyka", "Programowanie", 2);
        Student student2 = new Student(12345, "Informatyka", "Technologie mobilne",4);
        Student student3 = new Student(osoba, 12345, "Informatyka");
        Student student4 = new Student(osoba, "Informatyka", "IoT");


//        student2.viewData();
//        student3.viewData();
//        student4.viewData();


        // Zadanie 3
//        student1.Dane();
//        student1.viewData();

        // Zadanie 4
        zadanie_4 zadanie = new zadanie_4();
        zadanie.IndexStudent();
        zadanie.DeleteStudent();


        zadanie.ShowStudent();
    }


}