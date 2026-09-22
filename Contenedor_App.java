package variables_polimorficas;

import java.util.Scanner;

public class Contenedor_App {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
   System.out.println("Ingresa nombre:");
   String nom=sc.nextLine();
   System.out.println("Ingresa calaificación:");
   int cal=sc.nextInt();
   
   Contenedor<String> nombre= new Contenedor<>(nom);
   
   Contenedor<Integer> calificación= new Contenedor<>(cal);
   
   System.out.println("Alumno: "+nombre.getcontenido());
   System.out.println("Calificación: "+calificación.getcontenido());
   
   sc.close();
	}

}
