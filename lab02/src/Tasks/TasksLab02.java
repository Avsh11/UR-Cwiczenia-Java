package Tasks;

public class TasksLab02 {
    // Zadanie 1 - Napisz metodę określania oraz rozwiązywania równania kwadratowego ax2+bx+c=0 , gdzie a, b i
    //c są dowolnymi stałymi podawanymi przez użytkownika.
    public void Task001(int a, int b, int c)
    {
        int delta = (b*b)+((-4)*a*c);

        if(delta < 0)
        {
            System.out.println("Równanie nie posiada pierwiastków (rozwiązań).");
        }
        else if(delta == 0)
        {
            int x0 = ((-b)/2*a);
        }
        else if(delta > 0)
        {
            double x1 = ((-b) + Math.sqrt(delta))/(2*a);
            double x2 = ((-b) - Math.sqrt(delta))/(2*a);
        }
    }
    // Zadanie 1

    // Zadanie 2 - Napisz metody wyznaczania wartości funkcji określonych wzorami dla argumentów rzeczywistych
    //podawanych przez użytkownika:
    public void Task002(double a, double b, double c)
    {
        System.out.println("a("+a+") = "+ fun_ax(a));
        System.out.println("b("+b+") = "+ fun_bx(b));
        System.out.println("c("+c+") = "+ fun_cx(c));

    }
    private double fun_ax(double ax)
    {
        if(ax>0){
            return (2*ax);
        }
        else if (ax==0)
        {
            return 0;
        }
        else
        {
            return (-3*ax);
        }
    }

    private double fun_bx(double bx) {
        if (bx >=1)
        {
            return (bx*bx);
        }
        else
        {
            return bx;
        }
    }

    private double fun_cx(double cx)
    {
        if(cx>2)
        {
            return (2+cx);
        }
        else if (cx==2)
        {
            return 8;
        }
        else
        {
            return (cx-4);
        }
    }
    // Zadanie 2

    // Zadanie 3 - Napisz metodę porządkowania trzech liczb x, y i z. Od najmniejszej do największej
    public void Task003(int x, int y, int z)
    {
        int[] tab = {x,y,z};

        for (int i = 1; i < 3; i++)
        {
            if(tab[i] < tab[i-1])
            {
                int tmp = tab[i];
                tab[i] = tab[i-1];
                tab[i-1] = tmp;
            }
        }
        System.out.println("Liczby przed posortowaniem");
        System.out.println("["+tab[0]+", "+tab[1]+", "+tab[2]+" ]");
    }
    // Zadanie 3

    // Zadanie 4 -Z wykorzystaniem operatorów logicznych ! (negacja), && (and) napisz metodę, który w zależności
    //od spełnienia pewnych warunków wyświetla odpowiednie komunikaty:
    //• Jeśli pada deszcz i jest autobus na przystanku, to „Weź parasol”, „Dostaniesz się na uczelnie”;
    //• Jeśli pada deszcz i nie ma autobusu, to „Nie dostaniesz się na uczelnię”;
    //• Jeśli nie pada deszcz i jest autobus na przystanku, to „Dostaniesz się na uczelnie”, „Miłego dnia
    //i pięknej pogody”
    public void Task004(boolean deszcz, boolean autobus)
    {
        if(deszcz && autobus)
        {
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnie");
        }
        else if(deszcz && !autobus)
        {
            System.out.println("Nie dostaniesz się na uczelnie");
        }
        else if(!deszcz && autobus)
        {
            System.out.println("Dostaniesz się na uczelnie");
            System.out.println("Miłego dnia i pięknej pogody");
        }
    }
    // Zadanie 4

    // Zadanie 5 - Z wykorzystaniem operatorów logicznych ! (negacja), || (or) napisz metodę, który w zależności od
    //spełnienia pewnych warunków wyświetla odpowiednie komunikaty:
    //• Jeśli nie ma zniżki na samochód lub otrzymałeś premię, to „Możesz kupić samochód !”, „Zniżki
    //na samochód nie ma”;
    //• Jeśli nie ma zniżki na samochód lub nie otrzymałeś premii, to „Zakup samochód trzeba odłożyć
    //na później...”, „Zniżki na samochód nie ma”;
    //• Jeśli jest zniżka na samochód lub otrzymałeś premię, to „Możesz kupić samochód !”.
    public void Task005(boolean znizka, boolean podwyzka)
    {
        if(!znizka || podwyzka)
        {
            System.out.println("Możesz kupić samochód!");
            System.out.println("Zniżki na samochód nie ma");
        }
        else if(!znizka || !podwyzka)
        {
            System.out.println("Zakup samochodu trzeba odłożyć na później...");
            System.out.println("Zniżki na samochód nie ma");
        }
        else if(znizka || podwyzka)
        {
            System.out.println("Możesz kupić samochód");
        }
    }
    // Zadanie 5

    // Zadanie 6 -Napisz program który w zależności od wyboru użytkownika pozwoli na wykonywanie działań
    //dodawania, odejmowania, iloczynu, ilorazu i reszty z dzielenia.
    public void Task006(double x, double y, int choose)
    {
        switch (choose)
        {
            case 1:
                System.out.println("Suma: "+(x+y));
                break;
            case 2:
                System.out.println("Odejmowanie: "+(x-y));
                break;
            case 3:
                System.out.println("Mnożenie: "+(x*y));
                break;
            case 4:
                if(y == 0)
                {
                    System.out.println("Nie dziel przez zero");
                }
                else
                {
                    System.out.println("Dzielenie: "+(x/y));
                }
                break;
            case 5:
                if(y == 0)
                {
                    System.out.println("Nie dziel przez zero");
                }
                else
                {
                    double modulo = x%y;
                    System.out.println("Modulo: "+modulo);
                }
                break;
            default:
                System.out.println("Podano błędne dane, spróbuj ponownie");
                break;
        }
    }
    // Zadanie 6


    public void CloseProgram() {

    }
}//Koniec klasy TasksLab02
