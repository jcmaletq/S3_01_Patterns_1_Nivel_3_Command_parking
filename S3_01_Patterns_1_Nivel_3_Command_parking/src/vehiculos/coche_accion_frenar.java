package vehiculos;
import acciones.*;
public class coche_accion_frenar implements Int_accion, Int_detiene {
private coche mi_coche;
public coche_accion_frenar (coche c) {
	mi_coche = c;
}
public void ejecuta () {
	mi_coche.frenar();
}
public void parar () {
	mi_coche.frenar();
}
}
