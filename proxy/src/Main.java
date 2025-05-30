//supongamos que tengo un reproductor de casettes y quiero que me reproduzca, cds ahora entonces
interface ViejoReproductor {
    void reproducir(String nombreArchivo);
}
//una interfaz con un servicio el cual queres adaptar para que pueda funcionar

class NuevoReproductor {
    public void play(String archivo) {
        System.out.println("Reproduciendo archivo: " + archivo);
    }
}






class ReproductorAdapter implements ViejoReproductor {
    private final NuevoReproductor nuevoReproductor;

    public ReproductorAdapter(NuevoReproductor nuevoReproductor) {
        this.nuevoReproductor = nuevoReproductor;
    }

    @Override
    public void reproducir(String nombreArchivo) {
        nuevoReproductor.play(nombreArchivo);
    }
}







public class Main {
    public static void main(String[] args) {
        NuevoReproductor nuevo = new NuevoReproductor();
        ViejoReproductor adaptador = new ReproductorAdapter(nuevo);

        adaptador.reproducir("cumbia_420.mp3");
    }
}
