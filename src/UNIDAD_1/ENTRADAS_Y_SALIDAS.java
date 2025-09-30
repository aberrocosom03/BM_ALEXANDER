package UNIDAD_1;

import java.util.Scanner; 

public class ENTRADAS_Y_SALIDAS {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Introduce tu nombre: ");
		 String nombre = sc.nextLine();
		 System.out.print("Introduce tu ciudad : ");
		 String ciudad = sc.nextLine();
		
		 System.out.println("Hola " + nombre + ", vives en " + ciudad );
		 }
	
	}
