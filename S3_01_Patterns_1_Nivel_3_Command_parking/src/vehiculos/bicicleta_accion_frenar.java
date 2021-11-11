package vehiculos;
import acciones.*;
public class bicicleta_accion_frenar implements Int_accion, Int_detiene {
private bicicleta mi_bici;
public bicicleta_accion_frenar (bicicleta b) {
	mi_bici = b;
}
public void ejecuta () {
	mi_bici.frenar();
}
public void parar () {
	mi_bici.frenar();
}
}
