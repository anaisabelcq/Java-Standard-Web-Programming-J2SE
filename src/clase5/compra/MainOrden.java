package clase5.compra;

import clase5.exceptions.SaldoInsuficienteExeption;

public class MainOrden {

	//comprador intenta realizar la compra de un monto superior a su saldo
	public static void main(String[] args) {
		//3 items
		Item cafe = new Item(1L, 100F, "cafe");
		Item budin = new Item(2L, 500F, "budin marmolado");
		Item puchos = new Item(3l, 150f, "camel");
		
		//comprador
		Comprador carlos = new Comprador(1L, 1000f);
		
		//medio de pago
		MedioPago mp = new MedioPago(1L, "MP", 1);
		
		//generador de la compra
		GeneradorOrden go = new GeneradorOrden();
		Item[] items = {cafe,budin, puchos};
		go.setItems(items);
		go.setComprador(carlos);
		
		Orden orden;
		try {
			orden = go.comprar(mp);
			System.out.println("La orden se genero exitosamente con el id="+ orden.getId());
		} catch (SaldoInsuficienteExeption sie) {
			System.err.println(sie);
			//logica 
		} catch(MedioPagoExeption mpe) {
			System.err.println(mpe);
		}
	}

}
