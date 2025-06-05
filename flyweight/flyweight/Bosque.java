package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Bosque {
	
	private List<Arbol> arboles = new ArrayList<>();

    public void plantarArbol(int x, int y, String nombre, String colorHojas, String textura) {
        TipoArbol tipo = FabricaTipoArbol.obtenerTipoArbol(nombre, colorHojas, textura);
        Arbol arbol = new Arbol(x, y, tipo);
        arboles.add(arbol);
    }

    public void dibujarBosque() {
        for (Arbol arbol : arboles) {
            arbol.dibujar();
        }
    }

}
