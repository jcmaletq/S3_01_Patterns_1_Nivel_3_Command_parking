package vehiculos;

public class bicicleta {
	public bicicleta_accion_arrancar test_bi_arr;
	public bicicleta_accion_acelerar test_bi_ace ;
	public bicicleta_accion_frenar test_bi_fre ;
	public bicicleta() {
		test_bi_arr = new bicicleta_accion_arrancar(this);
		test_bi_ace = new bicicleta_accion_acelerar(this);
		test_bi_fre = new bicicleta_accion_frenar(this);
	}
		public void arrancar() {
			System.out.println("bici pedaleando");	
		}
		public void acelerar() {
			System.out.println("bici acelerando");		
		}		
		public void frenar() {
			System.out.println("bici frenando");	
		}	
}
