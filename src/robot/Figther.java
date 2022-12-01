package robot;

import java.util.Random;

public class Figther extends Robot {
	private boolean seed;

	public Figther() {
		super();
	}

	public Figther(String a, int b) {
		super(a,b);
	}

	Figther fire(Figther r) {
			if (next() == true) {
				r.vie = r.vie;
				System.out.println(r.nom + " a ete loupe par " + this.nom + " vie: " + vie);
			} else if (next() == false) {
				r.vie -= 2;
				System.out.println(r.nom + " a ete touche par " + this.nom + "  vie: " + vie);
			}
			return r;
		}
		private boolean next() {
			Random rand = new Random();
			seed = rand.nextBoolean();
			return seed;
		}
}
