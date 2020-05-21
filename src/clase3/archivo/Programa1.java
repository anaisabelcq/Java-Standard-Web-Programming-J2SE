package clase3.archivo;

public class Programa1 {

	public static void main(String[] args) {
		
		String tipo = "mp3";
		
		Long tamanio = 1000L;

		String nombre = "file";
		//f5,f6/f7/f8
		Archivo a = new Archivo();
		
		a.setNombre(nombre);
		
		a.setTamanio(tamanio);
		
		a.setTipo(tipo);
		
		System.out.println(a);
		
		if("MP3".equalsIgnoreCase(a.getTipo())) {
			a = Conversor.convertir(a);
		}
		
		System.out.println(a);
	}

}
