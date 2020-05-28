package clase4;

import clase4.volador.Aterrizable;
import clase4.volador.Estado;
import clase4.volador.Volador;

public class Main {

	public static void main(String[] args) {
	
		Volador v = new Avion("747");
		
		Volador h = new Helicopetero("Apache");
		
		Volador s = new SuperMan("Clark Kent");
		
		//padre p = new hijo
		//hijo h = ne hijo
		Volador d = new Dron("XDS");
		
		Batman b = new Batman("Bruno Diaz");
		
		Volador chano = new Chano("chano");
		
		Volador[] voladores = {v,h,s,d,b, chano};
		
		Aterrizable[] atrs = new Aterrizable[voladores.length];
			
		int i=0;
		
		//for each		
		for(Volador aux : voladores) {
			
			//¿es un aterrizable?
			if(aux instanceof Aterrizable) {
				
				atrs[i++] = ((Aterrizable)aux);
				
				//qué paso con el estado?
				Estado estado = ((Aterrizable)aux).aterrizar();
				
				//hay error?
				if(!estado.getError()) {
				
					//¿ es una maquina?
					if(aux instanceof Maquina) {
	
						//casteo de Volador a Maquina
						Maquina m = (Maquina) aux;
						
						if(m.isTieneTurbinas()) {
							System.out.println("Enviando a la pista 1 a: " + aux);
						}else {
							System.out.println("Enviando a la pista 2 a: " + aux);
						}
					} else { 
					
						SuperHeroe sh = (SuperHeroe)aux;
						
						if(sh.getTieneCapa()) {
							System.out.println("Enviando a la pista 1 a: " + aux);
						}else {
							System.out.println("Enviando a la pista 2 a: " + aux);
						}
					}
				}else {
					System.out.println("Enviando a la pista 4 con ayuda a: " + aux);	
				}
			}else {
				System.out.println("No fue posible aterrizar el objeto : " + aux);
			}
		}
		
		System.out.println("-------");
		//con interfaces
		for(Aterrizable aux : atrs) {
			
			if(aux != null) {
			
				Estado estado = aux.aterrizar();
				
				if(estado.getError()) {
					System.out.println("Error aterrizando al objeto "+ aux);
				}
			}
		}
	}
}
