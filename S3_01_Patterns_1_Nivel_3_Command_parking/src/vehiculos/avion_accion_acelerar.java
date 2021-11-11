package vehiculos;
import acciones.*;
public class avion_accion_acelerar implements Int_accion, Int_detiene {
private avion mi_avion;
public avion_accion_acelerar (avion a) {
	mi_avion = a;
}
public void ejecuta () {
	mi_avion.acelerar();
}
public void parar () {
	mi_avion.acelerar();
}
}