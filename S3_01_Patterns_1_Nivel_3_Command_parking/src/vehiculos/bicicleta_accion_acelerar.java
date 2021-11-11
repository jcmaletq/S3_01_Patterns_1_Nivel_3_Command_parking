package vehiculos;
import acciones.*;
public class bicicleta_accion_acelerar implements Int_accion, Int_detiene {
private bicicleta mi_bici;
public bicicleta_accion_acelerar (bicicleta b) {
	mi_bici = b;
}
public void ejecuta () {
	mi_bici.acelerar();
}
public void parar () {
	mi_bici.acelerar();
}
}