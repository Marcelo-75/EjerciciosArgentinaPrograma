package clase1;

public class Ejercicio1_b {
	public static void main(String[] args) {
		// b. A lo anterior, solo muestre los números pares
		int numeroInicio = 5;
		int numeroFin = 14;
		// Se deberían mostrar los números: 6,8,10,12,14
		while(numeroFin >= numeroInicio) {
			if(numeroInicio % 2 == 0) { System.out.print(numeroInicio+";"); }
			numeroInicio++;
		}
	}
}
