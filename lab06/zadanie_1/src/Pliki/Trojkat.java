package Pliki;
// 11. Zmodyfikować klasę Prostokat i Trojkat, tak, aby dziedziczyły z klasy Figura
public class Trojkat extends Figura
{
	double wys=0, podst=0;
	// 13. Dodać konstruktor przeciążony dla klasy Trojkat postaci Trojkat(float wys,float podst,String kolor).
	public Trojkat(double wys, double podst)
	{
		this.wys = wys;
		this.podst = podst;
	}

	public Trojkat(String kolor, double wys, double podst) {
		super(kolor);
		this.wys = wys;
		this.podst = podst;
	}

	public Trojkat(Punkt punkt, double wys, double podst) {
		super(punkt);
		this.wys = wys;
		this.podst = podst;
	}

	// Konstruktor
	public Trojkat() {

	}

	@Override
	public String opis() {
		return super.opis();
	}
}