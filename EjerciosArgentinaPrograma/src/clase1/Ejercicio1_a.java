package clase1;

public class Ejercicio1_a {
	public static void main(String[] args) {
		// a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a” y “b”.
		int numeroInicio = 5;
		int numeroFin = 14;
		// Se deberían mostrar los números: 5,6,7,8,9,10,11,12,13,14
		while(numeroFin >= numeroInicio) {
			System.out.print(numeroInicio+";");
			numeroInicio++;
		}
	}
}
