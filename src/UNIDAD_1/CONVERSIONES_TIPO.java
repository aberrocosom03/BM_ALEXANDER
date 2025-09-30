package UNIDAD_1;

import java.util.Scanner;


public class CONVERSIONES_TIPO {
	public static void main(String[] args) {
		
		String letra = "A";
		
				
		
		 // Conversión implícita
		 int x = 25;
		 double y = x; // int → double
		 System.out.println("Implícita: " + y);
		 
		 // Conversión explícita
		 double a = 19.99;
		 int b = (int) a; // double → int
		 System.out.println("Explícita: " + b);
		 
		 // char ↔ int
		 Scanner sc = new Scanner(System.in);
		 String codigo = letra; 
		 System.out.println(codigo);
		 
		 // Pérdida de datos
		 int grande = 1000;
		 byte pequeño = (byte) grande;
		 System.out.println("Conversión con pérdida: " + pequeño);
		 
		 //Mixto
		 int d = 3;
		 float e = 2.5f;
		 float c = d * e;
		 System.out.println (c);
		 
		 }
		}

