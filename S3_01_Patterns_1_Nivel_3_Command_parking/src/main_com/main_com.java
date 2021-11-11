package main_com;
import vehiculos.*;
import acciones.*;
public class main_com {
/*
 * se ha usado dos tipos de comando uno para lanzar un proceso y otro para un cambio (activa uno y desactiva otro)
 */
public static void main(String[] args) {
		// TODO Auto-generated method stub
	// coche
   coche test_coche = new coche();
   //   cambios estados coche
   System.out.println("");
   System.out.println("comandos coche");
  // ejecuta_cambio (new cambio (test_co_arr,test_co_fre)) ;
   lanza.ejecuta_lanza (new lanza(test_coche.test_co_arr));
   cambio.ejecuta_cambio (new cambio (test_coche.test_co_ace,test_coche.test_co_arr)) ;
   lanza.ejecuta_lanza (new lanza(test_coche.test_co_ace));  
   cambio.ejecuta_cambio (new cambio (test_coche.test_co_fre,test_coche.test_co_ace)) ;
   cambio.ejecuta_cambio (new cambio (test_coche.test_co_ace,test_coche.test_co_fre)) ;
   //bicicleta
   bicicleta test_bici = new bicicleta();
   //   cambio estados bici  
   System.out.println("");
   System.out.println("comandos bici");
   lanza.ejecuta_lanza (new lanza(test_bici.test_bi_arr));
   cambio.ejecuta_cambio (new cambio (test_bici.test_bi_ace,test_bici.test_bi_arr)) ;
   cambio.ejecuta_cambio (new cambio (test_bici.test_bi_fre,test_bici.test_bi_ace)) ;
 
   //avion
   avion test_av = new avion(); 
   //   cambio estados avion
   System.out.println("");
   System.out.println("comandos avion");
   lanza.ejecuta_lanza (new lanza(test_av.test_av_arr));
   cambio.ejecuta_cambio (new cambio (test_av.test_av_ace,test_av.test_av_arr)) ;
   cambio.ejecuta_cambio (new cambio (test_av.test_av_fre,test_av.test_av_ace)) ;
   //barco
   barco test_ba = new barco();

   //   cambio estados barco
   System.out.println("");
   System.out.println("comandos barco");
   lanza.ejecuta_lanza (new lanza(test_ba.test_ba_arr));
   cambio.ejecuta_cambio (new cambio (test_ba.test_ba_ace,test_ba.test_ba_arr)) ;
   cambio.ejecuta_cambio (new cambio (test_ba.test_ba_fre,test_ba.test_ba_ace)) ;
	}

}
