package vehiculos;
import acciones.*;
public class barco_accion_frenar implements Int_accion, Int_detiene {
private barco mi_avi;
public barco_accion_frenar (barco a) {
	mi_avi = a;
}
public void ejecuta () {
	mi_avi.frenar();
}
public void parar () {
	mi_avi.frenar();
}
}
