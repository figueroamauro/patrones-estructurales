package flyweight;

public class TipoArbol {
	
	private String nombre;
    private String colorHojas;
    private String textura;

    public TipoArbol(String nombre, String colorHojas, String textura) {
        this.nombre = nombre;
        this.colorHojas = colorHojas;
        this.textura = textura;
    }

    public void dibujar(int x, int y) {
        System.out.println("Dibujando " + nombre + " en (" + x + "," + y + ") con hojas " + colorHojas + " y textura " + textura);
    }

}
