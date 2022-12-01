package robot;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r = new Robot("bob",10);
		Robot r2 = new Robot("robin",10);
		Arena a= new Arena(r, r2);
		Figther F=new Figther();
		r.show();
		System.out.println("");
		r2.show();
		System.out.println("");
		System.out.println("");
		//r.fire(r,r2);
		a.figth(r, r2);
		
	}

}
