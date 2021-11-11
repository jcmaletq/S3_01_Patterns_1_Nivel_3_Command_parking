package vehiculos;
import acciones.*;
public class coche_accion_arrancar implements Int_accion, Int_detiene {
private coche mi_coche;
public coche_accion_arrancar (coche c) {
	mi_coche = c;
}
public void ejecuta () {
	mi_coche.arrancar();
}
public void parar () {
	mi_coche.arrancar();
}
}
