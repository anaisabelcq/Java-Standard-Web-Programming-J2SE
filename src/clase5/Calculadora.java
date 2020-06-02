package clase5;

public class Calculadora {

	private Integer a;
	private Integer b;
	
	public Calculadora(Integer a, Integer b) {
		this.a = a;
		this.b = b;
	}

	public double dividir() {
		
		return a / b;
	}

	public double dividir(Integer a, Integer b) {
		
		try {
			long c = a / b;
		
			return c;
		}catch (ArithmeticException e) {
			// de algo que es unchecked a checked...
			System.out.println(e.getMessage());
			return -1;
		}
	}
	
	public double getA() {
		return a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	
	
}
