package clase5.compra;

import java.util.Arrays;

import clase5.exceptions.SaldoInsuficienteExeption;

public class GeneradorOrden {

	private Comprador comprador;
	
	private Item[] items;
	
	public Orden comprar(MedioPago medioPago) throws SaldoInsuficienteExeption, MedioPagoExeption {
		
		float montoCompra = 0f;
		
		for(Item i : items) {
			montoCompra += i.getPrecio();
		}
		
		if(montoCompra > comprador.getSaldo() || comprador.getSaldo() == 0) {
			throw new SaldoInsuficienteExeption("El comprador " + comprador.getId() + " no posee saldo suficiente", null);
		}
		
		if(!medioPago.getMoneda().equals(comprador.getTipoMoneda())) {
			throw new MedioPagoExeption("El medio de pago del comprador no conicide con el del Medio seleccionad");
		}
		
		//ALT+SHIFT+M
		return crearteOrden(medioPago);
	}

	private Orden crearteOrden(MedioPago medioPago) {
		Orden orden = new Orden();
		orden.setComprador(comprador);
		orden.setMedioPago(medioPago);
		orden.setItems(items);
		//el id vendria informado desde la db
		orden.setId(1L);
		
		//logica de grabado en db
		if(orden.getMedioPago().getId() == 1) {
			throw new RuntimeException("Ocurrio un error en la db");
		}
		return orden;
	}

	@Override
	public String toString() {
		return "GeneradorOrden [comprador=" + comprador + ", items=" + Arrays.toString(items) + "]";
	}

	public void setItems(Item[] items) {
		this.items = items;		
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public Item[] getItems() {
		return items;
	}
	
}
