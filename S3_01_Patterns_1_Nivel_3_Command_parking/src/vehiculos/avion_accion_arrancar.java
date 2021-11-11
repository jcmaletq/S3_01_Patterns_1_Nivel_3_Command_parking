package vehiculos;
import acciones.*;
public class avion_accion_arrancar implements Int_accion, Int_detiene {
private avion mi_avi;
public avion_accion_arrancar (avion b) {
	mi_avi = b;
}
public void ejecuta () {
	mi_avi.arrancar();
}
public void parar () {
	mi_avi.arrancar();
}
}
