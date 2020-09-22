import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		 Integer a;
		 Integer b = 0;
		 Integer opcion;
		 Integer resultado;
		 System.out.println("Ingrese su operación /n 1 para sumar /n 2 para restar /n 3 para multiplicar /n 4 para dividir");
		 
		 opcion = teclado.nextInt();
		 
		 switch(opcion) {
		 
		 case 1:
			 System.out.println("Ingrese el primer numero");
			 a = teclado.nextInt();
			 System.out.println("Ingrese el segundo numero");
			 b = teclado.nextInt();
			 resultado = a + b;
			 System.out.println("El resultado es: " + resultado);
			 break;
		 case 2:	 
			 System.out.println("Ingrese el primer numero");
			 a = teclado.nextInt();
			 System.out.println("Ingrese el segundo numero");
			 b = teclado.nextInt();
			 resultado = a - b;
			 System.out.println("El resultado es: " + resultado);
			 break;
		 case 3:
			 System.out.println("Ingrese el primer numero");
			 a = teclado.nextInt();
			 System.out.println("Ingrese el segundo numero");
			 b = teclado.nextInt();
			 resultado = a * b;
			 System.out.println("El resultado es: " + resultado);
			 break;
		 case 4:
			 System.out.println("Ingrese el primer numero");
			 a = teclado.nextInt();
			 System.out.println("Ingrese el segundo numero");
			 b = teclado.nextInt();
			 resultado = a / b;
			 System.out.println("El resultado es: " + resultado);
		 }
		 }
		}