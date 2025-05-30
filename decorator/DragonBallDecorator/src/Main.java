public class Main {
    public static void main(String[] args) {
        Saiyajin goku = new SaiyajinBase();

        System.out.println("Poder de goku base: " + goku.getPoder() + "\n Cabello: " + goku.getColorDeCabello());

        // Luego goku entrena con kaiosama y aprende el kaioken que aumenta su poder 10 veces:
        goku = new Kaioken(goku);
        System.out.println("Poder de goku con kaioken: " + goku.getPoder() + "\n Cabello: " + goku.getColorDeCabello());

        // krillin.explotar()

        goku = new SuperSaiyan(goku);
        System.out.println("Poder de goku Super Saiyan: " + goku.getPoder() + "\n Cabello: " + goku.getColorDeCabello());

        // Y si quisiera, podria combinar ambas! porque los decorator van envolviendose entre si.

        goku = new SuperSaiyan(new Kaioken(goku));
        System.out.println("Poder de goku Super Saiyan + Kaioken!: " + goku.getPoder() + "\n Cabello: " + goku.getColorDeCabello());

    Saiyajin persona = new SuperSaiyan(new Kaioken(new SaiyajinBase()));
        System.out.println("Poder de persona Super Saiyan + Kaioken!: " + persona.getPoder() + "\n Cabello: " + persona.getColorDeCabello());
    }
}
    /*Primer paso para diseñar un patron decorator, detectar donde podriamos llegar a necesitar
 una estructura decorable, es decir, que a partir de un objeto base, lo envuelvas con una decoracion,
 como ese capitulo de los simpsons
 donde todos quieren comprar una barbie nueva, que solo tiene un sombrero diferente.
 */


// Una interfaz es un contrato, es decir, los objetos que implementen la interfaz, se comprometen
// a usar los metodos definidos en la misma.

    interface Saiyajin{
   Integer getPoder();
    String getColorDeCabello();
    }



// Primero definimos nuestra base, nosotros sabemos que todos los saiyajiines son de color Negro
// Nadie te conoce Trunks. Ah, tambien le agregue una fuerza base de 1000


    class SaiyajinBase implements Saiyajin{

    @Override
    public Integer getPoder() {

        return 1000;
    }
    @Override
    public String getColorDeCabello() {
        return "Negro";
    }
}

/* Despues creamos la clase abstracta, que en el constructor va a tener un objeto Saiyajin
Esto se hace, porque nosotros no queremos perder la referencia del Saiyajin que le pasamos,
se va a entender mas adelante
 */

abstract class SaiyanTransformaciones implements Saiyajin {
    protected Saiyajin saiyajinPepito;

    public SaiyanTransformaciones(Saiyajin saiyajinPepito) {
        this.saiyajinPepito = saiyajinPepito;


    }

    @Override
    public Integer getPoder() {
        return saiyajinPepito.getPoder();
    }

    @Override
    public String getColorDeCabello() {
        return saiyajinPepito.getColorDeCabello();
    }
}

class Kaioken extends SaiyanTransformaciones{
    public Kaioken(Saiyajin saiyajinPepito) {
        super(saiyajinPepito);
    }
    @Override
    public Integer getPoder() {
        return saiyajinPepito.getPoder() * 10;
    }
}


class SuperSaiyan extends SaiyanTransformaciones{
        public SuperSaiyan(Saiyajin saiyajinPepito) {
            super(saiyajinPepito);
          /* con esto estamos llamando al constructor de la clase padre, esto es util si lo necesitamos
        para modificar algo abajo
*
*/
        }

    @Override
    public Integer getPoder() {
        return saiyajinPepito.getPoder() * 100;
        /*como quiero que el super saiyan aumente 10 veces el nivel de un 'x' saiyajin, entonces llamo
        al constructor para que me pase el saiyajin base y a ese poder lo multiplico por 10.
         */
    }

    @Override
    public String getColorDeCabello() {
            return "Dorado";
    }
}









