package Tasks;
import java.util.Scanner;

public class InputData {
    //obiekt klasy scanner
    Scanner input = new Scanner(System.in);
    //metoda do pobierania danych od uzytkownika
    protected int InputInt() {
        return input.nextInt();
    }

    //metody do wczytywania float, double, sting, boolen
    protected float InputFloat() {
        return input.nextFloat();
    }
    protected double InputDouble() {
        return input.nextDouble();
    }
    protected String InputString() {
        return input.next();
    }
    protected boolean InputBoolean() {
        return input.nextBoolean();
    }
}
