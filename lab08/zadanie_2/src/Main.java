import java.util.*;
//        Zadanie 2.
//        Napisz metodę, która będzie zwracać silnię podanej jako argument liczby. Metoda powinna rzucać
//        wyjątek rodzaju Checked zdefiniowanego przez Ciebie typu BlednaWartoscDlaSilniException, gdy jej
//        argument będzie ujemny. Skorzystaj z tej metody w main, obsługując potencjalny wyjątek.
public class Main {
    public static int silnia(int x)
    {
        int iloczyn = 1;
        try{
            if (x < 0){
                throw new IllegalAccessException("Nie można używać liczby ujemnej");
            }

            for (int i  = 1; i<= x; i++){
                iloczyn = iloczyn * i;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return iloczyn;
    }

    public static void main(String[] args) {
        int  x = -2137;
        int silnia_x = silnia(x);
        System.out.println("Silnia wynosi:" + silnia_x);
        }
    }
