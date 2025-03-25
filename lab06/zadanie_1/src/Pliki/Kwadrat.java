package Pliki;

public class Kwadrat extends Prostokat
{
    // 16. Zdefiniować nową klasę Kwadrat dziedziczącą z klasy Prostokat.
    // Umieścić w niej gettery i setery.

    public double getWys() {
        return wys;
    }

    public void setWys(double wys) {
        this.wys = wys;
    }

    public double getSzer() {
        return szer;
    }

    public void setSzer(double szer) {
        this.szer = szer;
    }

    @Override
    public String opis() {
        return super.opis();
    }
}
