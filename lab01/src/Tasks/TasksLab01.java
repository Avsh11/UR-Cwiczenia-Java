package Tasks;

public class TasksLab01 {


    // ZADANIE 1 - Napisz metodę, która zwróci twoje imię oraz aktualny wiek.
    protected String Task001(String name, int age)
    {
        return "Imię: " + name + ", wiek: " + age;
    }
    // ZADANIE 1

    // ZADANIE 2 - Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn.
    //Argumenty przekazywane do metody są liczbami wprowadzanymi przez użytkownika z klawiatury.
    public void Task002(double value01, double value02)
    {
        double suma = value01 + value02;
        double roznica = value01 - value02;
        double iloczyn = value01 * value02;
        double iloraz = 1;

        System.out.println("Suma: " + suma);
        System.out.println("Roznica: " + roznica);
        System.out.println("Iloczyn: " + iloczyn);
        if(value02 != 0)
        {
            iloraz = (value01 / value02);
            System.out.printf("Iloczyn: %.2f\n", iloraz);
        }
        else
        {
            System.out.println("Nie dzielimy przez 0!");
        }
    }
    // ZADANIE 2

    // ZADANIE 3 - Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli
    // liczba jest parzysta.

    public boolean Task003(int number)
    {
        if(number % 2 == 0)
        {
            return true;
        }else
        {
            return false;
        }

    }
    // ZADANIE 3

    // ZADANIE 4 - Napisz metodę, która jako argument przyjmuje liczbę i zwraca true
    // jeśli liczba jest podzielna przez
    //3 i przez 5.
    public boolean Task004(int number)
    {
        if(number % 3 == 0 && number % 5 == 0)
        {
            return true;
        }else{
            return false;
        }
    }
    // ZADANIE 4

    // ZADANIE 5 - Napisz metodę, która jako argument przyjmuje liczbę i
    // zwraca go podniesionego do 3 potęgi
    public double Task005(double number)
    {
        return Math.pow(number,3);
    }
    // ZADANIE 5

    // ZADANIE 6 - Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy.
    public double Task006(double number)
    {
        return Math.sqrt(number);
    }
    // ZADANIE 6

    // ZADANIE 7 - Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli
    //z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
    //Argumenty przekazywane do metody są liczbami losowymi z przedziału <a,b> a i b wczytywane są
    //przez użytkownika z klawiatury.
    public boolean Task007(int x, int y, int z)
    {
        if((x + y) > z && (x+z) > y && (z + y) > x )
        {
            int x2 = x*x;
            int y2 = y*y;
            int z2 = z*z;

            if((x2+y2) == z2 || (x2+z2) == y2 || (y2+z2) == x2)
            {
                return true;
            }

        }
        return false;
    }
    // ZADANIE 7
}
