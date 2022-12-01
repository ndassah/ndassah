package robot;

public class Arena extends Robot {

	Robot r, r1;
	public Arena() {
		super();
	}

	public Arena(Robot r, Robot r1) {
        this.r=r;
        this.r1=r1;
	}

	public void figth(Robot r, Robot r2) {
		
		while (r2.vie != 0) {
			r.fire(r2);
			if (r2.vie != 0) {
				r2.fire(r);
			} else {
				System.out.println("Combat termine...");
			}
		}
	}
}
