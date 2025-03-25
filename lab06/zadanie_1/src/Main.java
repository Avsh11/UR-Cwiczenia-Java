import Pliki.*;

// 1. Utwórz projekt zawierający funkcje Main.
public class Main
{
    public static void main(String[] args)
    {
        // 6. W metodzie main() utwórz trzy obiekty typu Punkt.
        Punkt punkt_1=new Punkt(1,2);
        Punkt punkt_2=new Punkt(2,3);
        Punkt punkt_3=new Punkt(3,4);

        // 7. Pokaż, w jaki sposób można wykorzystać każdą ze zdefiniowanych metod.
        System.out.println("Początkowe współrzędne punkt_1:");
        punkt_1.opis();

        // Zmiana wartosci setterami
        punkt_1.setX(10);
        punkt_1.setY(15);
        System.out.println("Po zmianie wartości:");
        punkt_1.opis();

        // Zerowanie
        punkt_1.zeruj();
        System.out.println("Po zerowaniu:");
        punkt_1.opis();

        // Przesuniecie
        punkt_1.przesun(5, 5);
        System.out.println("Po przesunięciu o (5,5):");
        punkt_1.opis();

        // 9. Utworzyć obiekty typu Figura, Prostokat i Trojkat. Sprawdzić działanie wybranych metod dla
        //utworzonych obiektów.
        Figura figura=new Figura("zielony");
        Prostokat prostokat=new Prostokat(3,5);
        Trojkat trojkat=new Trojkat(4,6);



        Okrag okrag = new Okrag(punkt_2,3);

        System.out.println(figura.opis());
        System.out.println("Powierzchnia prostokąta: " + prostokat.getPowierzchnia());

        // 15. Dla obiektu typu Prostokat wywołać metodę przesun(3,5)
        prostokat.przesun(3,5);

        // 17. Utworzyć dowolny obiekt typu Kwadrat i nadać mu dowolną wartość początkową

        Kwadrat kwadrat = new Kwadrat();
        kwadrat.setSzer(3);
        kwadrat.setSzer(5);

        // 19. Dla utworzonych obiektów wywołać metodę opis(), w taki sposób, aby opis o danym obiekcie został
        //wyświetlony na konsolę.

        // Prostokat
        prostokat.opis();
        trojkat.opis();
        kwadrat.opis();
        okrag.opis();
    }

} // Koniec klasy main