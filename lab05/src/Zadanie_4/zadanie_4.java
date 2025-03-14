package Zadanie_4;

import InputData.InputData;
import Tasks.Osoba;
import Tasks.Student;

public class zadanie_4
{
    Student[] students = new Student[100];

    public zadanie_4()
    {
        for(int i = 0; i < students.length; i++)
        {
            students[i] = SortStudent();
        }
    }

    public Student SortStudent()
    {
            return (new Student(new Osoba("","",0), 0,"","",0));
    }

    public void IndexStudent()
    {
        InputData inputData = new InputData();
        System.out.println("Podaj index użytkownika: ");
        int index = inputData.InputInt();
        students[index].Dane();
    } // Podpunkt 1

    public void EditStudent()
    {
        InputData inputData = new InputData();
        System.out.println("Podaj index użytkownika: ");
        int index = inputData.InputInt();
        System.out.println("Stare informacje: ");
        students[index].viewData();
        System.out.println("Nowe informacje: ");
        students[index].Dane();
    } // Podpunkt 2

    public void DeleteStudent()
    {
        InputData inputData = new InputData();
        System.out.println("Podaj index użytkownika do usunięcia: ");
        int index = inputData.InputInt();
        System.out.println("Stare informacje: ");
        students[index].viewData();
        System.out.println("Czy chcesz usunąć dane TRUE /  FALSE");
        String option = inputData.InputString();
        if(option.equals("TRUE"))
        {
            students[index] = SortStudent();
        }
    } // Podpunkt 3

    public void ShowStudent()
    {
        InputData inputData = new InputData();
        System.out.println("Podaj index użytkownika: ");
        int index = inputData.InputInt();
        students[index].viewData();
    } // Podpuknkt 4

    public void AllStudents()
    {
        for(Student student : students)
        {
            student.viewData();
        }
    } // Podpunkt 5

    public void ReachStudents()
    {
        InputData inputData = new InputData();
        System.out.println("Podaj zakres: ");
        int limit_1 = inputData.InputInt();
        int limit_2 = inputData.InputInt();
        for(int i = limit_1; i <= limit_2; i++)
        {
            students[i].viewData();
        }

    } // Podpunkt 6

}
