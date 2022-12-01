package robot;



public class Robot {
//entites de ma classe
	protected String nom;
	protected int vie;

	public Robot() {
		this.nom = "";
		this.vie = 10;
	}

	public Robot(String a, int b) {
		this.nom = a;
		this.vie = b;
	}

	public String getNom() {
		return nom;
	}

	public int getVie() {
		return vie;
	}

	public void show() {
		System.out.print("Robot " + nom);
	}


	public Robot fire(Robot r) {
		int dommage = 2;
		r.vie = r.vie - dommage;
		if((!isDead(r)) ){
		System.out.println(r.nom + " a ete touche par " + this.nom + " ("   + r.nom + " points de vie):   " + r.vie);
				}
		return r;
	}
//methode isDead
	public boolean isDead(Robot r) {
		if (r.vie == 0) {
			System.out.println("Game over for " + r.nom);
			return true;
		}
		else if (r.vie >= 1 && r.vie <= 10) {
			System.out.println(r.nom + " is still alive");
		}
		return false;
	}

	
	
}
