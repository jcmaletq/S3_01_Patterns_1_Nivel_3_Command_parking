package acciones;
import acciones.*;
public class cambio {
  private Int_accion n_estado;
  private Int_detiene v_estado;
  
  public cambio (Int_accion nuev, Int_detiene viej) {
	  n_estado = nuev; 
	  v_estado = viej;
  }
 
  public void activa_nuevo( ) {  
//	  System.out.print(" cmd cambio -- ");
      n_estado.ejecuta ( ) ;  
      System.out.print("  ->  ");
    }
  public void desactiva_viejo( ) {
	  System.out.print("desactiva ");
      v_estado.parar ( );

    }
  public static void ejecuta_cambio (cambio test_camb) {
	   test_camb.activa_nuevo();
	   test_camb.desactiva_viejo();
}

}
