package clase3.archivo;

//clase
public final class Conversor {

	//metodos estatico heredable pero es posible sobrescribir
	public final static Archivo convertir(Archivo source) {
		
		// ALGUNA LIBRERIA QUE CONVIERTA
		return new TXT(source.getNombre(), source.getTamanio());
	}
	
}
