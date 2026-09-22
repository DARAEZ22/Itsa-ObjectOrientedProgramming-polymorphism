package variables_polimorficas;
//This variable can take any form depending on what we need. It can be an integer, double, string, etc.
//The (t) means it's a polimorphic variable.
public class Contenedor<t> {
 private t contenido;
 
 public Contenedor(t contenido){
	 this.contenido=contenido;
 }
 
 public t getcontenido() {
	 return this.contenido;
 }
 public void setcontenido(t contenido) {
	 this.contenido=contenido;
 }
 
}
