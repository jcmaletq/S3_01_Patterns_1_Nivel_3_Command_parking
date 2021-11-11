package vehiculos;

public class avion {
	// recibe la peticion
	  public avion_accion_arrancar test_av_arr;
	  public avion_accion_acelerar test_av_ace;
	  public avion_accion_frenar test_av_fre;
	public avion() {
		test_av_arr = new avion_accion_arrancar(this);
		test_av_ace = new avion_accion_acelerar(this);
		test_av_fre = new avion_accion_frenar(this);	
	}
	
		public void arrancar() {
			System.out.println("avion despegando");	
		}
		public void acelerar() {
			System.out.println("avion acelerando");		
		}		
		public void frenar() {
			System.out.println("avion aterrizando");	
		}	
}
