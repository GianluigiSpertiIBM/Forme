package model;

import java.util.Scanner;

import interfaces.Forma;

public class Quadrato extends Rettangolo implements Forma {
		
		private double lato;

		@Override
		public void inserisciDimensioni(){
			System.out.println("Inserisci lato quadrato: ");
			Scanner lato = new Scanner(System.in);
			this.lato = lato.nextDouble();
		}
		
		@Override
		public void stampaDimensioni() {
			System.out.print("Lato quadrato: " + lato + "\n");
			System.out.print("Perimetro quadrato: " + calcolaPerimetro() + "\n");
			System.out.print("Area quadrato: " + calcolaArea() + "\n");
		}
		
		@Override
		public double calcolaPerimetro() {
			return 4*lato;
		}

		@Override
		public double calcolaArea() {
			return lato*lato;
		}

}
