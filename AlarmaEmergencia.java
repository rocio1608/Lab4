
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
		 return super.toString() + "…" +
		super.toString();
		 }
		

	
	
	
	alarmaIncendio.m1(); // emergencia 1
	alarmaIncendio.m2(); // alarma 1 / timbre 1
	System.out.println(alarmaIncendio); // emergencia Ring...Ring...Ring...Ring
}
}
