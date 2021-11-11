package vehiculos;
import acciones.*;
public class avion_accion_frenar implements Int_accion, Int_detiene {
private avion mi_avi;
public avion_accion_frenar (avion a) {
	mi_avi = a;
}
public void ejecuta () {
	mi_avi.frenar();
}
public void parar () {
	mi_avi.frenar();
}
}
