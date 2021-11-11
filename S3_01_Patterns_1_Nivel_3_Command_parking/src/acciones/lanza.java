package acciones;
import acciones.*;
public class lanza {
  private Int_accion n_estado;
  
  public lanza (Int_accion nuev) {
	  n_estado = nuev; 

  }
 
  public void activa_nuevo( ) { 
//	  System.out.println();
//	  System.out.print(" cmd lanza -- ");
      n_estado.ejecuta ( ) ;  
    }
  public static void ejecuta_lanza (lanza test_camb) {
	   test_camb.activa_nuevo();
}
}
