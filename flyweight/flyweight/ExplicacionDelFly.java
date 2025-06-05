package flyweight;

public class ExplicacionDelFly {

	
	/*
	 * la idea del patron es:
	 * 
	 * AHORRAR MEMORIA
	 * 
	 * como? basicamente esto dice no tiene sentido instanciar varias veces una clase si solo vas a cambiar 1 o 2 atributos pero todos los demas atributos se repiten
	 * 
	 * que propone? dividamos la clase en 2, en un estado interno(que no cambia) y un estado EXTERNO (VA A CAMBIAR)
	 * 
	 * de esta manera el estado interno solo lo instanciamos una vez
	 * 
	 * pero ahora el estado externo este si vamos a instanciarlo LAS VECES QUE QUERAMOS
	 * 
	 * entonces de esta manera queda que el estadoo interno solo se instancia 1 SOLA VEZ y cuando quiera crear mas instancias del objeto en si. lo unico que se instancia NUEVO es el "estado externoo" y para el "estado interno" solo se reutiliza el que se creo en algun momento
	 * de esa menra ahorras memoria al soloo instanciar 1 estado interno para todos los objetos que quieras y solo instancian el estado externoo,
	 * 
	 * si vemos el ejemplo del arbol, vemos que "tipoArbol"(estadoInterno) y "arbol"(estadoExterno)
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	
}
