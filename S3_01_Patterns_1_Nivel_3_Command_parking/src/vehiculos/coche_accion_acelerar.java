package vehiculos;
import acciones.*;
public class coche_accion_acelerar implements Int_accion, Int_detiene {
private coche mi_coche;
public coche_accion_acelerar (coche c) {
	mi_coche = c;
}
public void ejecuta () {
	mi_coche.acelerar();
}
public void parar () {
	mi_coche.acelerar();
}
}
