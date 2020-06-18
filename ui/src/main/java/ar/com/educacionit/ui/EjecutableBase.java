package ar.com.educacionit.ui;

import ar.com.educacionit.services.ProductoServices;
import ar.com.educacionit.services.ProductoServicesImpl;

public class EjecutableBase {

	protected ProductoServices ps;
	
	public EjecutableBase() {
		ps = new ProductoServicesImpl();
	}
}
