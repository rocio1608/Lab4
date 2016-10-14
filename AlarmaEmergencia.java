
public class AlarmaEmergencia extends Timbre {

	AlarmaEmergencia alarmaIncendio = new AlarmaEmergencia();
	
	public void m1() {
		System.out.println("emergencia");
	}
	
	public void m2() {
		super.m1();
		super.m2();
	}
	
	public String toString() {
		 return super.toString() + "emergencia" + "…" +
		super.toString();
}
		

	
}

