package start;
import java.util.ArrayList;
import java.util.Scanner;
import interfaces.Forma;
import model.Cerchio;
import model.Quadrato;
import model.Rettangolo;

public class Main {

	public static void main(String[] args) {
		ArrayList <Forma> f = new ArrayList <Forma>();
		int menu;
		do {
			System.out.println("\n0: Esci");
			System.out.println("1: Inserisci rettangolo");
			System.out.println("2: Inserisci cerchio");
			System.out.println("3: Inserisci quadrato");
			System.out.println("4: Stampa ArrayList Forme");
			Scanner s = new Scanner(System.in);
			menu = s.nextInt();
			
			switch(menu) {
				case 1: 
					//test rettangolo
					Rettangolo r =new Rettangolo();
					r.inserisciDimensioni();
					r.calcolaArea();
					r.calcolaPerimetro();
					r.stampaDimensioni();
					f.add(r);
					break;
				case 2: 
					//test cerchio
					Cerchio c = new Cerchio();
					c.inserisciDimensioni();
					c.calcolaArea();
					c.calcolaPerimetro();
					c.stampaDimensioni();
					f.add(c);
					break;
				case 3: 
					//test quadrato
					Quadrato q = new Quadrato();
					q.inserisciDimensioni();
					q.calcolaArea();
					q.calcolaPerimetro();
					q.stampaDimensioni();
					f.add(q);
					break;	
				case 4:
					for (int i=0; i<f.size(); i++) {
						f.get(i).stampaDimensioni();
						System.out.println("__________________");
					}
			}
		}while(menu!=0);
	}

}
