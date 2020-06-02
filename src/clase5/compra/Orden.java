package clase5.compra;

import java.util.Arrays;

public class Orden {

	private Long id;
	private Comprador comprador;
	private MedioPago medioPago;
	private Item[] items;

	/*public Orden(Comprador comprador, MedioPago medioPago) {
		this.comprador = comprador;
		this.medioPago = medioPago;
	}*/

	public void setComprador(Comprador comprador) {
		this.comprador =comprador ;
	}

	public void setMedioPago(MedioPago medioPago) {
		this.medioPago = medioPago;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public MedioPago getMedioPago() {
		return medioPago;
	}

	@Override
	public String toString() {
		return "Orden [comprador=" + comprador + ", medioPago=" + medioPago + ", items=" + Arrays.toString(items) + "]";
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	public Item[] getItems() {
		return items;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
