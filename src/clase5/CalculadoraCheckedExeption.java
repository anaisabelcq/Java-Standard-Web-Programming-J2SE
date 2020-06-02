package clase5;

import clase5.exceptions.CalculoException;

public class CalculadoraCheckedExeption {

	public static void main(String[] args) {
		
		try {
			boolean flag = false; 
			if(flag) {
				//crear una nueva exeption
				throw new Exception("Ocurrio un error");
			}else {
				throw new CalculoException("Ocurrio un error");
			}
		//atrapar
		// throws
		}catch (CalculoException e) {
			System.out.println("Error atrapado Tipo CalculoException");
		}catch (Exception e) {
			System.out.println("Error atrapado Tipo Exception");
		}

	}

}
