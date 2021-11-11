package vehiculos;

public class barco {
	// recibe la peticion
	   public barco_accion_arrancar test_ba_arr ;
	   public barco_accion_acelerar test_ba_ace ;
	   public barco_accion_frenar test_ba_fre ;
	   
	   public barco() {
		   test_ba_arr = new barco_accion_arrancar(this);
		   test_ba_ace = new barco_accion_acelerar(this);
		   test_ba_fre = new barco_accion_frenar(this);   
	   }
		public void arrancar() {
			System.out.println("barco zarpando");	
		}
		public void acelerar() {
			System.out.println("barco acelerando");		
		}		
		public void frenar() {
			System.out.println("barco atracando");	
		}	
}
