package flyweight;

public class Arbol {

	  private int x;
	    private int y;
	    private TipoArbol tipo;

	    public Arbol(int x, int y, TipoArbol tipo) {
	        this.x = x;
	        this.y = y;
	        this.tipo = tipo;
	    }

	    public void dibujar() {
	        tipo.dibujar(x, y);
	    }
}
