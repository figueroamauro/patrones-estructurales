package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaTipoArbol {

	private static Map<String, TipoArbol> tipos = new HashMap<>();

    public static TipoArbol obtenerTipoArbol(String nombre, String colorHojas, String textura) {
        String clave = nombre + "-" + colorHojas + "-" + textura;
        if (!tipos.containsKey(clave)) {
            tipos.put(clave, new TipoArbol(nombre, colorHojas, textura));
        }
        return tipos.get(clave);
    }
}
