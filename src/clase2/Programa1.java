package clase2;

public class Programa1 {

	//punto de inicio de mi programa
	public static void main(String[] args) {
		
		//creo  objeto con contructor por defecto
		PlanTelefonico planBase = new PlanTelefonico();
		
		System.out.println(planBase);
		
		//parametrizado
		PlanTelefonico planX = new PlanTelefonico(3,200,20000,"PLAN Z");
		
		System.out.println(planX);
	}
}
