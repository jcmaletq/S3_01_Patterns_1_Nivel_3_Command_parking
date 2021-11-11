package vehiculos;

import acciones.*;

public class coche {
public coche_accion_arrancar test_co_arr;
public coche_accion_acelerar test_co_ace ;
public coche_accion_frenar test_co_fre ;
	
	
	public coche() {
		test_co_arr = new coche_accion_arrancar(this);
		test_co_ace = new coche_accion_acelerar(this);
		test_co_fre = new coche_accion_frenar(this);
	}
	public void arrancar() {
		System.out.println("coche arrancando");
		
	}
	public void acelerar() {
		System.out.println("coche acelerando");
		
	}
	public void frenar() {
		System.out.println("coche frenando");
		
	}

}
