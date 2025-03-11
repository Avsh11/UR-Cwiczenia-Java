package Tasks;
import InputData.InputData;
import InputData.RandomValue;

import java.util.Arrays;

public class TasksLab04
{
    // Zadanie 1 - Napisz program obliczający sumę i średnią elementów tablicy z użyciem pętli for oraz for each.
    //Elementy do tablicy mają zostać wylosowane z dowolnego przedziały. Należy zaproponować
    //oddzielną metodę do losowania liczb.
    public int Task001SU(int[] array)
    {
        int suma = 0;
        for (int i = 0; i < array.length; i++)
        {
            suma += array[i];
        }
        return suma;
    }

    public double Task001SR(int[] array)
    {
        double suma = Task001SU(array);
        return (suma / array.length);
    }
    // Zadanie 1

    // Zadanie 2 -Napisz program, który wypisze co drugi element zdefiniowanych przez Ciebie tablic. Pierwsza
    //tablica powinna mieć parzystą liczbę elementów, a druga nieparzystą.

    // Użytkownik wpisuje czy deklarujemy sami ? ? ?

    public void Task002()
    {
        int[] arrayEVEN = {1,2,3,4,5,6,7,8,9,10}; // 10
        int[] arrayODD = {1,3,5,3,4,12,3,23,10,23,42}; // 11

        System.out.println("Elementy (co drugi) tablicy pierwszej: ");
        for (int i = 1; i < arrayEVEN.length; i += 2)
        {
            System.out.println(arrayEVEN[i]);
        }

        System.out.println("Elementy (co drugi) tablicy drugiej: ");
        for (int i = 1; i < arrayODD.length; i += 2)
        {
            System.out.println(arrayODD[i]);
        }

    }
    // Zadanie 2

    // Zadanie 3 - Napisz program, w którym zdefiniujesz tablicę wartości typu String i zainicjalizujesz ją
    //przykładowymi wartościami. Skorzystaj z pętli for-each, aby wypisać wszystkie wartości
    //tablicy ze wszystkimi literami zamienionymi na wielkie. Skorzystaj z funkcjonalności
    //toUpperCase wartości typu String..

    public void Task003()
    {
        String[] tab = {"finland", "sweden", "norway", "latvia", "communist china"};
        for (String i : tab)
        {
            System.out.println(i.toUpperCase());
        }
    }
    // Zadanie 3

    // Zadanie 4 - Napisz program, który pobierze od użytkownika pięć słów i zapisze je w tablicy. Następnie,
    //program powinien wypisać wszystkie słowa, od ostatniego do pierwszego, z literami
    //zapisanymi od końca do początku. Dla przykładu, dla podanych słów "Ala", "ma", "kota", "i",
    //"psa" program powinien wypisać: "asp", "i", "atok", "am", "alA".

    // ! ! !

    public String[] Task004(String[] tab)
    {
        String[] result = new String[tab.length];
        for(int i = 0; i < tab.length; i++)
        {
            String temp = "";

            for(int j = tab[i].length()-1; j >= 0; j--)
            {
                temp += tab[i].charAt(j);
            }
                result[i] = temp;
        }
        return result;
    }
    // Zadanie 4

    // Zadanie 5 - Napisz program, który pobierze od użytkownika osiem liczb, zapisze je w tablicy, a następnie
    //posortuje tą tablicę rosnąco i wypisze wynik sortowania na ekran. Dla przykładu, dla liczb 10,
    //-2, 1, 100, 20, -15, 0, 10, program wypisze -15, -2, 0, 1, 10, 10, 20, 100. Zastanów się, jak można
    //posortować ciąg liczb i spróbuj zaimplementować swoje rozwiązanie. Przetestuj je na różnych
    //zestawach danych. Możesz też skorzystać z jednego z popularnych algorytmów sortowania, np.
    //sortowania przez wstawianie. Działanie algorytmu omówiono szczegółowo na zajęciach
    //algorytmy i struktury danych.

    public int[] Task005(int[] tab)
    {
        Arrays.sort(tab);

        return tab;
    }
    // Zadanie 5

    // Zadanie 6 - Napisz program, który pobierze od użytkownika pięć liczb, zapisze je w tablicy, a następnie
    //policzy i wypisze silnię każdej z pobranych liczb.

    public int Task006(int n)
    {
        int result = 1;
        for (int i = 1; i <= n; i++)
        {
            result *= i;
        }
        return result;
    }

    // Zadanie 7 - Napisz program, w którym zdefiniujesz dwie tablice przechowujące wartości typu String.
    //Zainicjalizuj obie tablice takimi samymi wartościami, w takiej samej kolejności. Napisz kod,
    //który porówna obie tablice i odpowie na pytanie, czy są one takie same.

    public boolean Task007(String[] tab_1, String[] tab_2)
    {
        if(Arrays.equals(tab_1, tab_2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Zadanie 7

} // Koniec klasy TasksLab04
