import java.util.*; // Pamiętać, aby nie stosować takiej praktyki, tylko do prostych zadań maksymalnie - lenistwo.

public class Main {
    public static void main(String[] args) {
        // Zadanie 1.
        //Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek. Do obliczenia
        //pierwiastka możesz użyć istniejącej metody java.lang.Math.sqrt(). Jeśli użytkownik poda liczbę ujemną
        //rzuć wyjątek java.lang.IllegalArgumentException. Obsłuż sytuację, w której użytkownik poda ciąg
        //znaków, który nie jest liczbą.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoją liczbę: ");

        try {    // try - testowanie rzeczy - jeśli coś wyjdzie to spoko, jeśli coś się nie wykona to będe wiedział, że wykona się źle więc:
            String tekst = scanner.next(); // String ponieważ my chcemy obsłużyć ciąg znaków, który nie jest liczbą.
            double liczba  = Double.parseDouble(tekst); // Parsowanie -> zamieniamy stringa na doubla.

            if(liczba < 0)
            {
                throw new IllegalArgumentException("Nie będziemy liczyć piewriastka z liczby ujemnej ! ! !"); // Tutaj sprawdzamy coś specjalnego
            }

            double pierwiastek = Math.sqrt(liczba);
            System.out.println("Pierwiastek z liczby: " + liczba + " wynosi: " + pierwiastek );

        } catch (
                NumberFormatException e) {    // Używam catch żeby pokazać błąd (o ile coś się stanie a jak nie to się wykona po prostu).
            System.out.println("Błąd: niepoprawny format liczby, podaj liczbę ponownie ! ! !"); // lub e.getMessage() - defaultowy tekst błędu.
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: liczba nie może być ujemna (nie obsługujemy liczb zespolonych), podaj liczbę dodatnią ! ! !");
        }
    }
}