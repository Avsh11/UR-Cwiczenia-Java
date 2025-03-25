package Pliki;
// 11. Zmodyfikować klasę Prostokat i Trojkat, tak, aby dziedziczyły z klasy Figura
public class Prostokat extends Figura {
	protected double wys=0, szer=0;

	//	12. Dodać konstruktor przeciążony dla klasy Prostokat postaci: Prostokat(float wys,float szer, String
//			kolor). Wewnątrz konstruktora powinien być wywołany konstruktor z klasy bazowej.

	public Prostokat(double wys,double szer){
		this.wys = wys;
		this.szer = szer;

	}

	public Prostokat(String kolor, double wys, double szer) {
		super(kolor);
		this.wys = wys;
		this.szer = szer;
	}

	public Prostokat(Punkt punkt, double wys, double szer) {
		super(punkt);
		this.wys = wys;
		this.szer = szer;
	}

	// Konstruktor
	public Prostokat() {

	}

	public double getPowierzchnia() {
		return (szer * wys);
	}

	// 14. Dodać metodę przesuwającą prostokąt o dane współrzędne void przesun(float x, float y).

	public void przesun(int x, int y)
	{
		punkt.x += x;
		punkt.y += y;
	}

	@Override
	public String opis() {
		return super.opis();
	}
}