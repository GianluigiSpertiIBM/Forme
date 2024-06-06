package model;
import java.util.Scanner;
import interfaces.Forma;

public class Cerchio implements Forma {

	private double raggio;
	
	@Override
	public void inserisciDimensioni(){
		System.out.println("Inserisci raggio cerchio: ");
		Scanner raggio = new Scanner(System.in);
		this.raggio = raggio.nextDouble();
	}

	@Override
	public void stampaDimensioni() {
		System.out.print("Raggio cerchio: " + raggio + "\n");
		System.out.print("Perimetro cerchio: " + calcolaPerimetro() + "\n");
		System.out.print("Area cerchio: " + calcolaArea() + "\n");
	}

	@Override
	public double calcolaPerimetro() {
		return 2*raggio*Math.PI;
	}

	@Override
	public double calcolaArea() {
		return Math.PI*Math.pow(raggio, 2);
	}
}