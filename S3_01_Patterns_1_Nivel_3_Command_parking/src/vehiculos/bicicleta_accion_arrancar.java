package vehiculos;
import acciones.*;
public class bicicleta_accion_arrancar implements Int_accion, Int_detiene {
private bicicleta mi_bici;
public bicicleta_accion_arrancar (bicicleta b) {
	mi_bici = b;
}
public void ejecuta () {
	mi_bici.arrancar();
}
public void parar () {
	mi_bici.arrancar();
}
}
