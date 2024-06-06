package model;
import java.util.Scanner;
import interfaces.Forma;

public class Rettangolo implements Forma {

	private double base;
	private double altezza;
	

	@Override
	public void inserisciDimensioni(){
		System.out.println("Inserisci base rettangolo: ");
		Scanner base = new Scanner(System.in);
		this.base = base.nextDouble();
		System.out.println("Inserisci altezza rettangolo: ");
		Scanner altezza = new Scanner(System.in);
		this.altezza = altezza.nextDouble();

	}

	@Override
	public void stampaDimensioni() {
		System.out.print("Base rettangolo: " + base + "\n");
		System.out.print("Altezza rettangolo: " + altezza + "\n");
		System.out.print("Perimetro rettangolo: " + calcolaPerimetro() + "\n");
		System.out.print("Area rettangolo: " + calcolaArea() + "\n");
	}

	@Override
	public double calcolaPerimetro() {
		return 2*(base+altezza);
	}

	@Override
	public double calcolaArea() {
		return base*altezza;
	}
}
