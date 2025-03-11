package InputData;

import java.util.Random;

// Parametr a - początek przedziału losowania
// Parametr b - koniec przedziału losowania
public class RandomValue
{
    public static int[] RandValue(int a, int b, int ilosc)
    {

        if(a>b)
        {
            System.out.println("Początek przedziału nie może być większy od końca.");
            return null;
        }

        if(ilosc < 0)
        {
            System.out.println("Ilość elementów do wylosowanie nie może być mniejsza od zera.");
            return null;
        }

        Random rand = new Random();

        int[] values = new int[ilosc];

        for (int i = 0; i < values.length; i++)
        {
            values[i] = rand.nextInt(b-a+1)+a;
        }
        return values;

    }
}
