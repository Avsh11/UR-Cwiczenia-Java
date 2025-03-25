package Pliki;
// 2. Utwórz klasę Punkt, która zawiera publiczne pola (współrzędne): x oraz y.
public class Punkt
{
    public int x;
    public int y;

    // 3. Dla klasy Punkt zdefiniuj konstruktor bezparametrowy, który zainicjuje początkowe wartości
    //atrybutów.
    public Punkt() {
        this.y = 0;
        this.x = 0;
    }

    // 4. Zdefiniuj drugi konstruktor, który przekazane parametry zapamięta, jako wartości atrybutów: x i y.
    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 5. Zdefiniuj następujące metody dla klasy punkt:
    //• gettery i settery
    //• void zeruj();
    //• void opis();
    //• void przesun(int x, int y);
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void opis()
    {
        System.out.println("Punkt o współrzędnych: (" + x + ", " + y + ")");
    }

    public void zeruj()
    {
        this.x = 0;
        this.y = 0;
    }

    public void przesun(int x, int y)
    {
        this.x += x;
        this.y += y;
    }

}
